import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);


    ANTLRInputStream input = new ANTLRInputStream("interger as is 5");

        PyTrunLexer x = new PyTrunLexer((input));
        CommonTokenStream tokens = new CommonTokenStream(x);
        PyTrun parser = new PyTrun(tokens);
        ParseTree tree = parser.start();

       System.out.println(tree.toStringTree(parser));
  //      System.out.println(((PyTrun.DclContext) tree).ASSIGN());
        /*for(ParseTree i : ((PyTrun.StmtContext) tree).children){
            System.out.println(i.toStringTree(parser));
            System.out.println(i.getChildCount());
            System.out.println(tree.getChildCount());
        }*/
        //System.out.println(((PyTrun.StmtContext) tree).ifstmt());
        BuildASTVisitor visitor = new BuildASTVisitor();
        AbstractNode ast = visitor.visit(tree);
        System.out.println(ast);
        PrettyPrintAST visitor2 = new PrettyPrintAST();
        visitor2.visit(ast);
        //System.out.println(ast);
    }

}
