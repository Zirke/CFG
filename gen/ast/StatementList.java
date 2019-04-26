package ast;

import java.util.List;

public class StatementList extends AbstractNode{
    List<Statement> stmts;

    public StatementList(List<Statement> stmts) {
        this.stmts = stmts;
    }

    public List<Statement> getStmts() {
        return stmts;
    }

    public void setStmts(List<Statement> stmts) {
        this.stmts = stmts;
    }
}
