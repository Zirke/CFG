import ast.AbstractNode;
import cfg.PyTrun;
import cfg.PyTrunLexer;
import CodeGeneration.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main{

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        String d = "";
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            d += st;
            d += "\n";
        }

        ANTLRInputStream input = new ANTLRInputStream(d);
        PyTrunLexer x = new PyTrunLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(x);
        PyTrun parser = new PyTrun(tokens);
        ParseTree tree = parser.start();

        BuildASTVisitor visitor = new BuildASTVisitor();
        AbstractNode ast = visitor.visit(tree);

        symbolTable.SymbolTableVisitor symbolTableVisitor = new symbolTable.SymbolTableVisitor();
        symbolTable.SymbolTable sym = null;
        try {
            sym = (symbolTable.SymbolTable) symbolTableVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Emitter emitter = new Emitter(args[1]);
        CodeGenVisitor codeGenFunctionVisitor = new CodeGenVisitor(emitter, true);
        codeGenFunctionVisitor.setupConcat();
        try {
            codeGenFunctionVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        CodeGenVisitor codeGenVisitor = new CodeGenVisitor(emitter, false);

        for (String s : args){
            if(s.equals("--loop")){
                codeGenVisitor.setupInLoop();
                try {
                    codeGenVisitor.visit(ast);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                codeGenFunctionVisitor.closeLoopEmitter();
            } else {
                codeGenVisitor.setupInSetup();
                try {
                    codeGenVisitor.visit(ast);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                codeGenFunctionVisitor.closeSetupEmitter();
            }
            if(s.equals("--upload")){
                String command = "arduino --upload "+args[1];
                Runtime.getRuntime().exec(command);
            }
        }
    }
}