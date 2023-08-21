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

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private double current = 0.0;
    private Scanner scan;

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    public double deposit(String input) throws NegativeAmountException, NumberFormatException {
        double amount = Double.parseDouble(input);

        if (amount > 0.0) current += amount;
        else throw new NegativeAmountException();

        return current;
    }

    public double withdrawal(String input) throws InsufficientFundsException, NegativeAmountException, NumberFormatException{
        double cash = Double.parseDouble(input);

        if (cash > 0.0){
            if (cash <= current){
                current -= cash;
                return cash;
            }
            else throw new InsufficientFundsException();
        }else throw new NegativeAmountException();

    }

    public double getCurrent() {
        return current;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

}

