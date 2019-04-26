package ast;

public class TurnLeftStatement extends Statement{
    Value val;

    public TurnLeftStatement(Value val) {
        this.val = val;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
