package ast;

public abstract class TruthOperator extends Operator implements Value{
    Value lhs;
    Value rhs;

    public TruthOperator(String spelling) {
        super(spelling);
    }

    public TruthOperator() {
    }

    public TruthOperator(Value lhs, Value rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Value getLhs() {
        return lhs;
    }

    public void setLhs(Value lhs) {
        this.lhs = lhs;
    }

    public Value getRhs() {
        return rhs;
    }

    public void setRhs(Value rhs) {
        this.rhs = rhs;
    }
}
