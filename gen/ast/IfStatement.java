package ast;

import java.util.List;

public class IfStatement extends Statement{
    Value truthVal;
    StatementList trueStm;
    List<ElseIfStatement> elseifs;
    ElseThenStmt elsethen;

    public IfStatement(Value truthVal, StatementList trueStm, List<ElseIfStatement> elseifs, ElseThenStmt elsethen, int linenr) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elseifs = elseifs;
        this.elsethen = elsethen;
        this.setLineNumber(linenr);
    }

    public IfStatement(Value truthVal, StatementList trueStm, int linenr) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.setLineNumber(linenr);
    }

    public IfStatement(Value truthVal, StatementList trueStm, List<ElseIfStatement> elseifs, int linenr) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elseifs = elseifs;
        this.setLineNumber(linenr);
    }

    public IfStatement(Value truthVal, StatementList trueStm, ElseThenStmt elsethen, int linenr) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elsethen = elsethen;
        this.setLineNumber(linenr);
    }

    public Value getTruthVal() {
        return truthVal;
    }

    public void setTruthVal(Value truthVal) {
        this.truthVal = truthVal;
    }

    public StatementList getTrueStm() {
        return trueStm;
    }

    public void setTrueStm(StatementList trueStm) {
        this.trueStm = trueStm;
    }

    public List<ElseIfStatement> getElseifs() {
        return elseifs;
    }

    public void setElseifs(List<ElseIfStatement> elseifs) {
        this.elseifs = elseifs;
    }

    public ElseThenStmt getElsethen() {
        return elsethen;
    }

    public void setElsethen(ElseThenStmt elsethen) {
        this.elsethen = elsethen;
    }


}
