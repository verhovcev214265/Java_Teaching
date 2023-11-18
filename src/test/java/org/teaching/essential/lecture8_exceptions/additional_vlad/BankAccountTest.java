package org.teaching.essential.lecture8_exceptions.additional_vlad;

import org.junit.Assert;
import org.junit.Before;
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
        double parsed = bankAccount.parse("1000.55");
        bankAccount.deposit(parsed);
        Assert.assertEquals(2000.55, bankAccount.getCurrentBalance(), 0.001);
    }

    @Test
    public void shouldWithdrawCash_from_CurrentBalance() throws InsufficientFundsException, NegativeAmountException {
        double parsed = bankAccount.parse("500.32");
        bankAccount.withdrawal(parsed);
        Assert.assertEquals(499.68, bankAccount.getCurrentBalance(), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void shouldThroughNumberFormat_When_UserInputIncorrectValue() throws NegativeAmountException {
        double parsed = bankAccount.parse("aaaa");
        bankAccount.deposit(parsed);
    }

    @Test()
    public void shouldThroughNegativeAmount_When_UserInputNegativeValue(){
        double parsed = bankAccount.parse("-1000");
        Exception exception = assertThrows(NegativeAmountException.class, () -> bankAccount.deposit(parsed));

        String expected = "You tried to fill the account with a negative value is a very bad idea !!!";
        String actual = exception.getMessage();

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = InsufficientFundsException.class)
    public void aa() throws NegativeAmountException, InsufficientFundsException {
        // TODO: rename!
        double parsed = bankAccount.parse("1000.01");
        bankAccount.withdrawal(parsed);
    }

    @Test
    public void shouldThroughInsufficientFundsException_When_UserHaveNotEnoughMoney(){
        double parsed = bankAccount.parse("2000.01");
        Exception exception = assertThrows(InsufficientFundsException.class, () -> bankAccount.withdrawal(parsed));

        String expected = "There are not enough founds in the your account!";
        String actual = exception.getMessage();

        Assert.assertEquals(expected, actual);
    }
}
