package ast;

public class Append extends ArithmOperator {

    public Append(String spelling, Value left, Value right, int linenr) {
        super(spelling, left, right);
        this.setLineNumber(linenr);
    }
     public Append(int linenr){
        this.setLineNumber(linenr);
     }
}
