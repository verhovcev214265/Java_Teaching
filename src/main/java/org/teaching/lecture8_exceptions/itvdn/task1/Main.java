package org.teaching.lecture8_exceptions.itvdn.task1;

/*
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
возникновении ошибок должны выбрасываться исключения.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean exit = false;
        double result;

        try (Scanner scan = new Scanner(System.in)) {
            calculator.setScan(scan);
            while (!exit) {
                System.out.println(
                        "Choose the operation: \n" +
                                "1 - add; \n" +
                                "2 - sub; \n" +
                                "3 - mul; \n" +
                                "4 - div; \n" +
                                "exit - any button."
                );
                try {
                    int operation = scan.nextInt();
                    switch (operation) {
                        case 1:
                            logger.info("Addition: {}", calculator.add());
                            break;
                        case 2:
                            logger.info("Substraction: {}", calculator.sub());
                            break;
                        case 3:
                            logger.info("Mul: {}", calculator.mul());
                            break;
                        case 4:
                            logger.info("Div: {}", calculator.div());
                            break;
                        default:
                            logger.info("Bye - bye!");
                            exit = true;
                            break;
                    }
                } catch (InputMismatchException e) {
                    logger.info("Bye - bye!");
                    exit = true;
                } catch (ArithmeticException e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }
}
