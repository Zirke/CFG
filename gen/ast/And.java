package ast;

public class And extends TruthOperator{

    public And(String spelling, Value lhs, Value rhs, int linenr) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
        this.setLineNumber(linenr);
    }

    public And(int linenr) {
        this.setLineNumber(linenr);
    }

}
