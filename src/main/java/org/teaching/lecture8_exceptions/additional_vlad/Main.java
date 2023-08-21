package org.teaching.lecture8_exceptions.additional_vlad;

/*
Задача: Создайте класс, представляющий банковский счет. Реализуйте методы для пополнения счета
и обработайте возможные исключения при некорректном вводе данных.

Создайте класс BankAccount, который содержит поля для хранения текущего баланса.
Реализуйте метод deposit, который будет пополнять баланс счета на указанную сумму, вводимую с консоли.
Реализуйте метод withdrawal, который будет снимать указанную сумму со счета.
Обработайте возможные исключения:
Если пользователь вводит некорректное значение (не число), обработайте NumberFormatException.
Если пользователь пытается пополнить счет отрицательной суммой, выбросьте собственное исключение NegativeAmountException.
Обработайте возможное исключение InsufficientFundsException, чтобы не допустить снятие денег, превышающих доступные средства.
В методе main создайте объект BankAccount и предложите пользователю ввести сумму для пополнения счета.
В случае успешного пополнения выведите текущий баланс счета.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        try {
            while (!exit) {
                LOGGER.info("Chose the action: \n" +
                        "Deposit money into the your account press 1. \n" +
                        "Cash withdrawal press 2.\n" +
                        "Exit press any button.");
                int action = scan.nextInt();

                try {
                    switch (action) {
                        case 1:
                            LOGGER.info("Enter amount:");
                            String inputCash = scan.next();
                            bankAccount.deposit(inputCash);
                            LOGGER.info("\nYou put in your account: " + inputCash + ".\n" +
                                    "Your current balance = " + bankAccount.getCurrent());
                            break;
                        case 2:
                            LOGGER.info("Enter amount:");
                            String outputCash = scan.next();
                            bankAccount.withdrawal(outputCash);
                            LOGGER.info(
                                    "\nYou have withdraw: " + outputCash + ".\n" +
                                            "Your current balance = " + bankAccount.getCurrent());
                            break;
                        default:
                            LOGGER.info("Bye - bye!");
                            exit = true;
                            break;
                    }
                } catch (NumberFormatException e) {
                    LOGGER.error("You must enter only numbers!");
                } catch (NegativeAmountException | InsufficientFundsException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            LOGGER.error("When you choose the action you must enter only numbers!");
        }
    }

}
