package ast;

public class TurnRightStatement extends Statement{
    Value val;

    public TurnRightStatement(Value val, int linenr) {
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
