package ast;

public class ArrayIndexStatement extends Statement{
    Identifier id;
    Value number;

    public ArrayIndexStatement(Identifier id, Value number, int linenr) {
        this.id = id;
        this.number = number;
        this.setLineNumber(linenr);
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Value getNumber() {
        return number;
    }

    public void setNumber(Value number) {
        this.number = number;
    }
}
