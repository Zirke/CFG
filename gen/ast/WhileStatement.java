package ast;

//Iterative control structure(s)
public class WhileStatement extends Statement{
    Value expr;
    StatementList stmts;

    public WhileStatement(Value expr, StatementList stmts, int linenr) {
        this.expr = expr;
        this.stmts = stmts;
        this.setLineNumber(linenr);
    }

    public Value getExpr() {
        return expr;
    }

    public void setExpr(Value expr) {
        this.expr = expr;
    }

    public StatementList getStmts() {
        return stmts;
    }

    public void setStmts(StatementList stmts) {
        this.stmts = stmts;
    }
}
