package ast;

public class TurnRightStatement extends Statement{
    Value val;

    public TurnRightStatement(Value val) {
        this.val = val;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
