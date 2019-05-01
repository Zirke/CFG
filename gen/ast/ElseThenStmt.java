package ast;

public class ElseThenStmt implements visitable {
    StatementList stms;

    public ElseThenStmt(StatementList stms) {
        this.stms = stms;
    }

    public StatementList getStms() {
        return stms;
    }

    public void setStms(StatementList stms) {
        this.stms = stms;
    }
}
