package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class VariableMissing extends SemanticException {
    public VariableMissing(String msg) {
        super(msg);
    }
}
