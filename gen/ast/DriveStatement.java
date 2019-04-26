package ast;

//Arduino statements
public class DriveStatement extends Statement{
    Value val;

    public DriveStatement(Value val) {
        this.val = val;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
