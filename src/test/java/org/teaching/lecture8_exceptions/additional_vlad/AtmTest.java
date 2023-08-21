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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertThrows;

public class AtmTest {

    private Scanner mockScan;
    private Atm atm;
    private BankAccount bankAccount;

    @Before
    public void setUp(){
        mockScan = Mockito.mock(Scanner.class);

        atm = new Atm();
        atm.setScan(mockScan);

        bankAccount.setScan(mockScan);
    }

    @Test
    public void checkDepositAction() throws NegativeAmountException {
        atm.bankAccountFactory(bankAccount);

        when(mockScan.nextInt()).thenReturn(1);
        when(mockScan.next()).thenReturn("1000.05");

        Assert.assertEquals(1000.5, bankAccount.getCurrent(), 0.001);
    }


}
