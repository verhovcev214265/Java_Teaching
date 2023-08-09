package org.teaching.lecture8_exceptions.itvdn.task1;

/*
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
возникновении ошибок должны выбрасываться исключения.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean exit = false;
        double result;

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

                if (operation < 0 || operation > 4) exit = true;

                calculator.setScan(scan);
                result = calculator.operationFactory(operation);

                System.out.println(result);
            } catch (InputMismatchException e) {
                System.out.println("Invalid argument!");
                exit = true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

}
