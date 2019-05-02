package ast;

public class Parameter extends Terminal implements Value{
    Type paramType;
    Identifier id;
    //ast.Identifier paramName;


    public Parameter(Type paramType, Identifier id, int linenr) {
        this.paramType = paramType;
        this.id = id;
        this.setLineNumber(linenr);
        //this.paramName = paramName;
    }

    public Type getParamType() {
        return paramType;
    }

    public void setParamType(Type paramType) {
        this.paramType = paramType;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }
}
