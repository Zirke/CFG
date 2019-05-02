package ast;

public class RepeatStatement extends Statement{
    StatementList stmts;
    Value expr;

    public RepeatStatement(StatementList stmts, Value expr, int linenr) {
        this.stmts = stmts;
        this.expr = expr;
        this.setLineNumber(linenr);
    }

    public StatementList getStmts() {
        return stmts;
    }

    public void setStmts(StatementList stmts) {
        this.stmts = stmts;
    }

    public Value getExpr() {
        return expr;
    }

    public void setExpr(Value expr) {
        this.expr = expr;
    }
}
