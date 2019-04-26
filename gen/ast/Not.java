package ast;

public class Not extends TruthOperator{
    Value truth;

    public Not(String spelling, Value truth) {
        super(spelling);
        this.truth = truth;
    }

    public Not() {
    }

    public Value getTruth() {
        return truth;
    }

    public void setTruth(Value truth) {
        this.truth = truth;
    }
}
