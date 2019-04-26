package ast;

public class ReturnStatement extends Statement {
    Value val;

    public ReturnStatement(Value val) {
        this.val = val;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
