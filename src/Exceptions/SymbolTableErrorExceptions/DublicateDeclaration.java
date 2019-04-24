package Exceptions.SymbolTableErrorExceptions;

public class DublicateDeclaration extends RuntimeException {

    public DublicateDeclaration(String msg) {
        super(msg);
    }
}
