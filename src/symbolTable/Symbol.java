package symbolTable;

import ast.AbstractNode;
import ast.Value;

import java.util.ArrayList;
import java.util.List;

public class Symbol {
    private AbstractNode node;
    private ArrayList< AbstractNode> nodes = new ArrayList<>();
    private int depth;
    private Value vType;
    private List<Value> parameters = new ArrayList<>();

    public Symbol(AbstractNode node, int depth, Value vType) {
        this.node = node;
        this.nodes.add(node);
        this.depth = depth;
        this.vType = vType;
    }

    public Symbol(AbstractNode node, int depth, Value vType, List<Value> parameters) {
        this.node = node;
        this.nodes.add(node);
        this.depth = depth;
        this.vType = vType;
        this.parameters = parameters;
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

    public List<Value> getParameters() {
        return parameters;
    }

    public void setNodes(AbstractNode nodes) {
        this.nodes.add(nodes);
    }
}
