package ast;

public class RepeatStatement extends Statement{
    StatementList stmts;
    Value expr;

    public RepeatStatement(StatementList stmts, Value expr) {
        this.stmts = stmts;
        this.expr = expr;
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
