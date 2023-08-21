package org.teaching.lecture8_exceptions.additional_vlad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Atm {

    private Scanner scan;

    private static final Logger LOGGER = LoggerFactory.getLogger(Atm.class);

    public double bankAccountFactory(BankAccount bankAccount) throws NegativeAmountException {

        double result = 0.0;

        LOGGER.info("Enter action:");
        int action = scan.nextInt();

        switch (action) {
            case 1:
                LOGGER.info("Enter amount:");
                String amount = scan.next();
                result = bankAccount.deposit(amount);
        }
        return result;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
