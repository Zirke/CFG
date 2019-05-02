package ast;

import java.util.List;

public class ReturnFunctionDeclaration extends FunctionDeclaration{
    Type returnType;

    public ReturnFunctionDeclaration(Identifier functionName, List<Parameter> parameters, StatementList stmtBody, Type returnType, int linenr) {
        super(functionName, parameters, stmtBody, linenr);
        this.returnType = returnType;

    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
