package Exceptions.SymbolTableErrorExceptions;

public class VariableMissing extends RuntimeException {
    public VariableMissing(String msg) {
        super(msg);
    }
}
