import CodeGeneration.CodeGenVisitor;
import CodeGeneration.Emitter;
import ast.AbstractNode;
import cfg.Trun;
import cfg.TrunLexer;
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
        TrunLexer x = new TrunLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(x);
        Trun parser = new Trun(tokens);
        ParseTree tree = parser.start();

        BuildASTVisitor visitor = new BuildASTVisitor();
        AbstractNode ast = visitor.visit(tree);

        symbolTable.SymbolTableVisitor symbolTableVisitor = new symbolTable.SymbolTableVisitor();
        try {
            symbolTableVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Emitter emitter = new Emitter(args[1]);
        CodeGenVisitor codeGenFunctionVisitor = new CodeGenVisitor(emitter, true);
        codeGenFunctionVisitor.setupConsts();
        codeGenFunctionVisitor.setupConcat();
        try {
            codeGenFunctionVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        CodeGenVisitor codeGenVisitor = new CodeGenVisitor(emitter, false);

        String command = null;
        boolean isLoop = false;
        for (String s : args){
            if (s.equals("--loop")){
                isLoop = true;
            }
            if(s.equals("--upload")){
                command = "arduino --upload "+args[1];

            }
        }
        if(isLoop){
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
        emitter.closeFile();

        if (command != null){
            Runtime.getRuntime().exec(command);
        }
    }
}