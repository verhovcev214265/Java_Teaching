package org.teaching.lecture8_exceptions.additional_nadia;

public class DogException extends Exception {

    public DogException() {
    }

    public DogException(String message){
        super(message);
    }

    public DogException(Throwable cause) {
        super(cause);
    }
}
