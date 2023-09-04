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

    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        boolean exit = false;

        try (Scanner scan = new Scanner(System.in)) {
            while (!exit) {
                logger.info("Chose the action: \n" +
                        "Deposit money into the your account press 1. \n" +
                        "Cash withdrawal press 2.\n" +
                        "Exit press any button.");
                int action = scan.nextInt();

                try {
                    switch (action) {
                        case 1:
                            logger.info("Enter amount:");
                            String inputCash = scan.next();
                            double amount = bankAccount.parse(inputCash);
                            bankAccount.deposit(amount);
                            logger.info("\nYou put in your account: " + inputCash + ".\n" +
                                    "Your current balance = " + bankAccount.getCurrentBalance());
                            break;
                        case 2:
                            logger.info("Enter amount:");
                            String outputCash = scan.next();
                            double parsedCash = bankAccount.parse(outputCash);
                            bankAccount.withdrawal(parsedCash);
                            logger.info(
                                    "\nTake your money: " + outputCash + ".\n" +
                                            "Your current balance = " + bankAccount.getCurrentBalance());
                            break;
                        default:
                            logger.info("Bye - bye!");
                            exit = true;
                            break;
                    }
                } catch (NumberFormatException e) {
                    logger.error("You must enter only numbers!");
                } catch (NegativeAmountException | InsufficientFundsException e) {
                    logger.error(e.getMessage());
                }
            }
        } catch (InputMismatchException e) {
            logger.error("When you choose the action you must enter only numbers!");
        }
    }
}
