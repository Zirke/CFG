package ast;

public class LessThan extends TruthOperator{

    public LessThan(String spelling, Value left, Value right) {
        super(spelling);
        this.lhs = left;
        this.rhs = right;
    }

    public LessThan() {
    }
}
