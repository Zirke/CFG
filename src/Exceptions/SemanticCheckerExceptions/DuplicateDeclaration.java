package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class DuplicateDeclaration extends SemanticException {

    public DuplicateDeclaration(String msg) {
        super(msg);
    }
}
