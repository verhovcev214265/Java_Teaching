package org.teaching.lecture8_exceptions.additional_vlad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsufficientFundsException extends Exception{

    private static final Logger LOGGER = LoggerFactory.getLogger(InsufficientFundsException.class);

    public InsufficientFundsException(){
        LOGGER.error("There are not enough founds in the your account!");
    }
}
