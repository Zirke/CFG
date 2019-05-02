package ast;

public class Or extends TruthOperator{

    public Or(String spelling, Value lhs, Value rhs, int linenr) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
        this.setLineNumber(linenr);
    }

    public Or(int linenr) {
        this.setLineNumber(linenr);
    }
}
