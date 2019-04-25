public class Sym {
    private AbstractNode node;
    private int depth;
    private Type type;

    public Sym(AbstractNode node, int depth, Type type) {
        this.node = node;
        this.depth = depth;
        this.type = type;
    }


    public Type getType() {
        return type;
    }

    public AbstractNode getNode() {
        return node;
    }

    public int getDepth() {
        return depth;
    }

}
