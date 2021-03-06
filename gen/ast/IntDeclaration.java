package ast;

//Declaration types
public class IntDeclaration extends Statement{
    Identifier id;
    Value value;

    public IntDeclaration(Identifier id, Value stm) {
        this.id = id;
        this.value = stm;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
