public class Sym {
    private AbstractNode node;
    private int depth;

    public Sym(AbstractNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Sym{" +
                "node=" + node +
                ", depth=" + depth +
                '}';
    }

    public AbstractNode getNode() {
        return node;
    }

    public int getDepth() {
        return depth;
    }

}
