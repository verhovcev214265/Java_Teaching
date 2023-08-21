package org.teaching.lecture8_exceptions.additional_vlad;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(){
        super("You tried to fill the account with a negative value is a very bad idea !!!");
    }
}
