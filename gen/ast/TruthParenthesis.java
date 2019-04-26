package ast;

public class TruthParenthesis extends TruthOperator{
    Value expr;

    public TruthParenthesis(String spelling, Value expr) {
        super(spelling);
        this.expr = expr;
    }

    public TruthParenthesis() {
    }

    public Value getExpr() {
        return expr;
    }

    public void setExpr(Value expr) {
        this.expr = expr;
    }
}
