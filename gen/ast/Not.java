package ast;

public class Not extends TruthOperator{
    Value truth;

    public Not(String spelling, Value truth, int linenr) {
        super(spelling);
        this.truth = truth;
        this.setLineNumber(linenr);
    }

    public Not(int linenr) {
        this.setLineNumber(linenr);
    }

    public Value getTruth() {
        return truth;
    }

    public void setTruth(Value truth) {
        this.truth = truth;
    }
}
