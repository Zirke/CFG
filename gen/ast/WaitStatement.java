package ast;

public class WaitStatement extends Statement{
    Value val;

    public WaitStatement(Value val, int linenr) {
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
