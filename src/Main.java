import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ANTLRInputStream input = new ANTLRInputStream("integer i");

        PyTrunLexer x = new PyTrunLexer((input));
        CommonTokenStream tokens = new CommonTokenStream(x);
        PyTrun parser = new PyTrun(tokens);
        ParseTree tree = parser.start();
        System.out.println(tree.toStringTree(parser));
        AbstractNode ast = new BuildASTVisitor().visitStart((PyTrun.StartContext) tree);
    }

}
