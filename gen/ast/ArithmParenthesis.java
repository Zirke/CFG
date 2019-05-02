package ast;

public class ArithmParenthesis extends ArithmOperator{ //right should be null
    public ArithmParenthesis(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }

}
