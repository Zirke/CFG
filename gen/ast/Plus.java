package ast;

public class Plus extends ArithmOperator{ //can also be used with truth values and in that case is not an arithmetic operation.
    public Plus(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }

    public Plus(int linenr) {
        this.setLineNumber(linenr);
    }
}
