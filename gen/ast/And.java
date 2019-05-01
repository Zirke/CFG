package ast;

public class And extends TruthOperator{

    public And(String spelling, Value lhs, Value rhs) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public And() {
    }

}
