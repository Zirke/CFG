package symbolTable;

import ast.AbstractNode;

public class Symbol {
    private AbstractNode node;
    private int depth;
    private ast.Type type;

    public Symbol(AbstractNode node, int depth, ast.Type type) {
        this.node = node;
        this.depth = depth;
        this.type = type;
    }


    public ast.Type getType() {
        return type;
    }

    public AbstractNode getNode() {
        return node;
    }

    public int getDepth() {
        return depth;
    }

}
