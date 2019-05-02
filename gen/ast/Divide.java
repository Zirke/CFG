package ast;

public class Divide extends ArithmOperator{
    public Divide(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }

    public Divide(int linenr) {
        this.setLineNumber(linenr);
    }
}
