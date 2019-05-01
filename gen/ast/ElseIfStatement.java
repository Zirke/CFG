package ast;

public class ElseIfStatement implements visitable{
    Value truth;
    //Identifier truthVar;
    StatementList stms;

    public ElseIfStatement(Value truth, StatementList stms) {
        this.truth = truth;
        this.stms = stms;
    }
   /* public ElseIfStatement(Identifier truthVar, StatementList stms) {
        this.truthVar = truthVar;
        this.stms = stms;
    }*/

    public Value getTruth() {
        return truth;
    }

    public void setTruth(Value truth) {
        this.truth = truth;
    }

    /*public Identifier getTruthVar() {
        return truthVar;
    }

    public void setTruthVar(Identifier truthVar) {
        this.truthVar = truthVar;
    }*/

    public StatementList getStms() {
        return stms;
    }

    public void setStms(StatementList stms) {
        this.stms = stms;
    }
}
