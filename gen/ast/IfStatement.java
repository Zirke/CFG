package ast;

import java.util.List;

public class IfStatement extends Statement{
    Value truthVal;
    StatementList trueStm;
    List<ElseIfStatement> elseifs;
    ElseThenStmt elsethen;

    public IfStatement(Value truthVal, StatementList trueStm, List<ElseIfStatement> elseifs, ElseThenStmt elsethen) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elseifs = elseifs;
        this.elsethen = elsethen;
    }

    public IfStatement(Value truthVal, StatementList trueStm) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
    }

    public IfStatement(Value truthVal, StatementList trueStm, List<ElseIfStatement> elseifs) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elseifs = elseifs;
    }

    public IfStatement(Value truthVal, StatementList trueStm, ElseThenStmt elsethen) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elsethen = elsethen;
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
