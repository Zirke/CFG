package ast;

public class GreaterThan extends TruthOperator{

    public GreaterThan(String spelling, Value left, Value right) {
        super(spelling);
        this.lhs = left;
        this.rhs = right;
    }

    public GreaterThan() {
    }


}
