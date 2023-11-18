package org.teaching.essential.lecture8_exceptions.additional_vlad;

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

public class BankAccount {
    private double currentBalance = 0.0;

    public double parse(String input) throws NumberFormatException {
        return Double.parseDouble(input);
    }

    public double deposit(double amount) throws NegativeAmountException, NumberFormatException {
        if (amount < 0) {
            throw new NegativeAmountException("You tried to fill the account with a negative value is a very bad idea !!!");
        }

        currentBalance += amount;
        return currentBalance;
    }

    public double withdrawal(double cash) throws InsufficientFundsException, NegativeAmountException, NumberFormatException {
        if (cash < 0) {
            throw new NegativeAmountException();
        }

        if (cash > currentBalance) {
            throw new InsufficientFundsException("There are not enough founds in the your account!");
        }

        currentBalance -= cash;
        return cash;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

}

