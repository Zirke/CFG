package ast;

import java.util.List;

public class ReturnFunctionDeclaration extends FunctionDeclaration{
    Type returnType;

    public ReturnFunctionDeclaration(Identifier functionName, List<Parameter> parameters, StatementList stmtBody, Type returnType) {
        super(functionName, parameters, stmtBody);
        this.returnType = returnType;

    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
