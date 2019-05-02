package ast;

import java.util.List;

//Function declaration classes
public class FunctionDeclaration extends Statement{
    Identifier functionName;
    List<Parameter> parameters;
    StatementList stmtBody;

    public FunctionDeclaration(Identifier functionName, List<Parameter> parameters, StatementList stmtBody, int linenr) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.stmtBody = stmtBody;
        this.setLineNumber(linenr);
    }

    public Identifier getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Identifier functionName) {
        this.functionName = functionName;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public StatementList getStmtBody() {
        return stmtBody;
    }

    public void setStmtBody(StatementList stmtBody) {
        this.stmtBody = stmtBody;
    }
}
