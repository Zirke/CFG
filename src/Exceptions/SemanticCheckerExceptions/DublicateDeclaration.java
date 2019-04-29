package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class DublicateDeclaration extends SemanticException {

    public DublicateDeclaration(String msg) {
        super(msg);
    }
}
