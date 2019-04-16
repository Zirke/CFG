import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ANTLRInputStream input = new ANTLRInputStream("5>2");

        PyTrunLexer x = new PyTrunLexer((input));
        CommonTokenStream tokens = new CommonTokenStream(x);
        PyTrun parser = new PyTrun(tokens);
        ParseTree tree = parser.expr();

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
        //System.out.println(ast);
    }

}
