package org.teaching.lecture8_exceptions.additional_vlad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class BankAccountTest {

    private BankAccount bankAccount;

    @Before
    public void setUp(){
        bankAccount = new BankAccount();
        bankAccount.setCurrentBalance(1000.00);
    }

    @Test
    public void shouldAddAmount_To_CurrentBalance() throws NegativeAmountException {
        bankAccount.deposit("1000.55");
        Assert.assertEquals(2000.55, bankAccount.getCurrentBalance(), 0.001);
    }

    @Test
    public void shouldWithdrawCash_from_CurrentBalance() throws InsufficientFundsException, NegativeAmountException {
        bankAccount.withdrawal("500.32");
        Assert.assertEquals(499.68, bankAccount.getCurrentBalance(), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void shouldThroughNumberFormat_When_UserInputIncorrectValue() throws NegativeAmountException {
        bankAccount.deposit("aaaa");
    }

    @Test()
    public void shouldThroughNegativeAmount_When_UserInputNegativeValue(){
        Exception exception = assertThrows(NegativeAmountException.class, () -> bankAccount.deposit("-1000"));

        String expected = "You tried to fill the account with a negative value is a very bad idea !!!";
        String actual = exception.getMessage();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = InsufficientFundsException.class)
    public void aa() throws NegativeAmountException, InsufficientFundsException {
        bankAccount.withdrawal("1000.01");
    }

    @Ignore
    @Test
    public void shouldThroughInsufficientFundsException_When_UserHaveNotEnoughMoney(){
        Exception exception = assertThrows(InsufficientFundsException.class, () -> bankAccount.withdrawal("2000.01"));

        String expected = "There are not enough founds in the your account!";
        String actual = exception.getMessage();

        Assert.assertEquals(expected, actual);
    }

}
