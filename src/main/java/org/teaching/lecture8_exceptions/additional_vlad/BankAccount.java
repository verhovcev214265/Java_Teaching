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

public class BankAccount {

    private double currentBalance = 0.0;

    public double deposit(String input) throws NegativeAmountException, NumberFormatException {
        double amount = Double.parseDouble(input);

        if (amount > 0.0) currentBalance += amount;
        else throw new NegativeAmountException();

        return currentBalance;
    }

    public double withdrawal(String input) throws InsufficientFundsException, NegativeAmountException, NumberFormatException{
        double cash = Double.parseDouble(input);

        if (cash < 0.0){
            throw new NegativeAmountException();
        }else if (cash > currentBalance){
            throw new InsufficientFundsException();
        }else {
            currentBalance -= cash;
            return cash;
        }
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

}

