package org.teaching.essential.lecture6_inners_nestedes.additional_nadia.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
- создать экземпляр класса User и вызвать метод createQuery();
- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
- создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
 */

public class UserTest {

    private User user;
    private static final String LOGIN = "Oleksandr";
    private static final int PASSWORD = 2142;
    private static final String EXPECTED = "The user login: " + LOGIN + "\n" +
            "password: " + PASSWORD + "\n" +
            "Has sent request to system.";

    @Before
    public void setUp(){
        user = new User(LOGIN, PASSWORD);
    }

    @Test
    public void createQuery_test(){
        Assert.assertEquals(EXPECTED, user.createQuery());
    }

    @Test
    public void printToLog_testA(){
        Assert.assertEquals(EXPECTED, user.new Query().printToLog());
    }

    @Test
    public void printToLog_testB(){
        Assert.assertEquals(EXPECTED, new User(LOGIN, PASSWORD).new Query().printToLog());
    }

}
