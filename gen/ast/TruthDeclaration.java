package ast;

public class TruthDeclaration extends Statement{
    Identifier id;
    Value expr;

    public TruthDeclaration(Identifier id, Value expr) {
        this.id = id;
        this.expr = expr;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Value getExpr() {
        return expr;
    }

    public void setExpr(Value expr) {
        this.expr = expr;
    }
}
