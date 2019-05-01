package ast;

public class ArrayDeclaration extends Statement{
    Identifier id;
    Type type;
    ArrayAsmValue values;

    public ArrayDeclaration(Identifier id, ArrayAsmValue values, Type type) {
        this.id = id;
        this.values = values;
        this.type = type;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayAsmValue getValues() {
        return values;
    }

    public void setValues(ArrayAsmValue values) {
        this.values = values;
    }

}
