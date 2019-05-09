import CodeGeneration.CodeGenVisitor;
import CodeGeneration.Emitter;
import ast.AbstractNode;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.PyTrun;
import parser.PyTrunLexer;
import semanticAnalysis.semanticVisitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {
        File file = new File("src/test.txt");
        String d = "";
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
           d += st;
           d += "\n";
            // System.out.println(st);
        }

        ANTLRInputStream input = new ANTLRInputStream(d);
        PyTrunLexer x = new PyTrunLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(x);
        PyTrun parser = new PyTrun(tokens);
        ParseTree tree = parser.start();

        //System.out.println(tree.toStringTree(parser));
        // System.out.println(((PyTrun.DclContext) tree).ASSIGN());
        /*for(ParseTree i : ((PyTrun.StmtContext) tree).children){
            System.out.println(i.toStringTree(parser));
            System.out.println(i.getChildCount());
            System.out.println(tree.getChildCount());
        }*/


        BuildASTVisitor visitor = new BuildASTVisitor();
        AbstractNode ast = visitor.visit(tree);
        //System.out.println(ast);
       /*   PrettyPrintAST visitor2 = new PrettyPrintAST();
        try {
            visitor2.visit(ast);
        }catch (NoSuchMethodException e){
            System.out.println(e);
        }*/
        // System.out.println(ast);

        symbolTable.SymbolTableVisitor symbolTableVisitor = new symbolTable.SymbolTableVisitor();
        semanticVisitor sV = new semanticVisitor();
        try {
            symbolTableVisitor.visit(ast);
            sV.visit(ast);
            sV.establishArrayHashMap();
            for(String s: sV.getSizeOfArrays().keySet()){
                System.out.println("array " + s + " has size " + sV.getSizeOfArrays().get(s));
            }

        }catch (NoSuchMethodException e){
            System.out.println(e);
        }

        Emitter emitter = new Emitter();
        CodeGenVisitor codeGenFunctionVisitor = new CodeGenVisitor(emitter, true);
        codeGenFunctionVisitor.setupStringCompare();
        try {
            codeGenFunctionVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        CodeGenVisitor codeGenVisitor = new CodeGenVisitor(emitter, false);
        codeGenVisitor.setup();
        try {
            codeGenVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        codeGenFunctionVisitor.closeEmitter();
    }
}
