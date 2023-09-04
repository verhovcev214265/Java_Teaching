package org.teaching.lecture8_exceptions.additional_vlad;

public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
    }

    public NegativeAmountException(String message) {
        super(message);
    }

    public NegativeAmountException(Throwable cause) {
        super(cause);
    }
}
