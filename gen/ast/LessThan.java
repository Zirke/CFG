package ast;

public class LessThan extends TruthOperator{

    public LessThan(String spelling, Value left, Value right, int linenr) {
        super(spelling);
        this.lhs = left;
        this.rhs = right;
        this.setLineNumber(linenr);
    }

    public LessThan() {
    }
}
