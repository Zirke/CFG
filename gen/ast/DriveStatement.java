package ast;

//Arduino statements
public class DriveStatement extends Statement{
    Value val;

    public DriveStatement(Value val, int linenr) {
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
