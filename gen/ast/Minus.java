package ast;

public class Minus extends ArithmOperator{
    public Minus(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }

    public Minus(int linenr) {
        this.setLineNumber(linenr);
    }
}
