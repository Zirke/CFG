package ast;

//Declaration types
public class IntDeclaration extends Statement{
    Identifier id;

    Value stm;

    public IntDeclaration(Identifier id, Value stm) {
        this.id = id;
        this.stm = stm;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Value getStm() {
        return stm;
    }

    public void setStm(Value stm) {
        this.stm = stm;
    }
}
