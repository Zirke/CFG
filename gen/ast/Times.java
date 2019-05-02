package ast;

public class Times extends ArithmOperator{
    public Times(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }

    public Times(int linenr) {
        this.setLineNumber(linenr);
    }
}
