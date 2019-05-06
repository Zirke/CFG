package symbolTable;
import ast.AbstractNode;
import ast.Value;

public class Symbol {
    private AbstractNode node;
    private int depth;
    private Value vType;

    public Symbol(AbstractNode node, int depth, Value vType) {
        this.node = node;
        this.depth = depth;
        this.vType = vType;
    }


    public Value getType() {
        return vType;
    }

    public AbstractNode getNode() {
        return node;
    }

    public int getDepth() {
        return depth;
    }

}
