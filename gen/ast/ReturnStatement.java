package ast;

public class ReturnStatement extends Statement {
    Value val;

    public ReturnStatement(Value val, int linenr) {
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
