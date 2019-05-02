package ast;

public class TurnLeftStatement extends Statement{
    Value val;

    public TurnLeftStatement(Value val, int linenr) {
        this.val = val;
        this.setLineNumber(linenr);
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
