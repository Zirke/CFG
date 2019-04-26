package ast;

public class TextDeclaration extends Statement{
    Identifier id;
    Value val;

    public TextDeclaration(Identifier id, Value stm) {
        this.id = id;
        this.val = stm;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }
}
