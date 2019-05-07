package ast;

public class FromStatement extends Statement implements Iterative{
    Value fromVal;
    Value toVal;
    FromKeyword uptoOrDownto;
    StatementList stmts;

    public FromStatement(Value fromVal, Value toVal, FromKeyword uptoOrDownto, StatementList stmts, int linenr) {
        this.fromVal = fromVal;
        this.toVal = toVal;
        this.uptoOrDownto = uptoOrDownto;
        this.stmts = stmts;
        this.setLineNumber(linenr);
    }

    public Value getFromVal() {
        return fromVal;
    }

    public void setFromVal(Value fromVal) {
        this.fromVal = fromVal;
    }

    public Value getToVal() {
        return toVal;
    }

    public void setToVal(Value toVal) {
        this.toVal = toVal;
    }

    public FromKeyword getUptoOrDownto() {
        return uptoOrDownto;
    }

    public void setUptoOrDownto(FromKeyword uptoOrDownto) {
        this.uptoOrDownto = uptoOrDownto;
    }

    public StatementList getStmts() {
        return stmts;
    }

    public void setStmts(StatementList stmts) {
        this.stmts = stmts;
    }
}
