package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class IncorrectOperatorUse extends SemanticException {
    public IncorrectOperatorUse(String message) {
        super(message);
    }
}
