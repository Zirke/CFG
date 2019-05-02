package ast;

import java.util.List;

public class FunctionCall extends Statement implements Value, ArrayAsmValue{
    Identifier functionName;
    List<Value> arguments;

    public FunctionCall(Identifier functionName, List<Value> arguments, int linenr) {
        this.functionName = functionName;
        this.arguments = arguments;
        this.setLineNumber(linenr);
    }

    public Identifier getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Identifier functionName) {
        this.functionName = functionName;
    }

    public List<Value> getArguments() {
        return arguments;
    }

    public void setArguments(List<Value> arguments) {
        this.arguments = arguments;
    }
}
