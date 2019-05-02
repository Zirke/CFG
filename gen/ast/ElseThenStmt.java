package ast;

public class ElseThenStmt implements visitable {
    StatementList stms;
    public int lineNumber;

    public ElseThenStmt(StatementList stms, int lineNr) {
        this.stms = stms;
        this.lineNumber = lineNr;
    }

    public StatementList getStms() {
        return stms;
    }

    public void setStms(StatementList stms) {
        this.stms = stms;
    }
}
