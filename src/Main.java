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
        File file = new File("src/prog");
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

        BuildASTVisitor visitor = new BuildASTVisitor();
        AbstractNode ast = visitor.visit(tree);

        symbolTable.SymbolTableVisitor symbolTableVisitor = new symbolTable.SymbolTableVisitor();
        semanticVisitor sV = new semanticVisitor();

        try {
            symbolTableVisitor.visit(ast);
            sV.visit(ast);
            //sV.putTogetherArrayHashMap();
            for(String s: sV.getSizeOfArrays().keySet()){
                System.out.println("array " + s + " has size " + sV.getSizeOfArrays().get(s));
            }

        }catch (NoSuchMethodException e){
            System.out.println(e);
        }



        CodeGenVisitor codeGenVisitor = new CodeGenVisitor(new Emitter());
        codeGenVisitor.setup();
        try {
            codeGenVisitor.visit(ast);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        codeGenVisitor.closeEmitter();
    }
}
