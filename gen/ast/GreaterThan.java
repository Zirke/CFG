package ast;

public class GreaterThan extends TruthOperator{

    public GreaterThan(String spelling, Value left, Value right, int linenr) {
        super(spelling);
        this.lhs = left;
        this.rhs = right;
        this.setLineNumber(linenr);
    }

    public GreaterThan() {
    }


}
