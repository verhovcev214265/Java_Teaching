package org.teaching.lecture6.additional_nadia.task1;

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
    private User.Query query;

    @Before
    public void setUp(){
        user = new User("Oleksandr", 2142);
        query = new User("Oleksandr", 2142).new Query();
    }

    @Test
    public void createQuery_test(){
        Object expected = "The user login: " + user.getLogin() + "\n" +
                "password: " + user.getPassword() + "\n" +
                "Has sent request to system.";

        Assert.assertEquals(expected, user.createQuery());
    }

    @Test
    public void printToLog_testA(){
        Object expected = "The user login: " + user.getLogin() + "\n" +
                "password: " + user.getPassword() + "\n" +
                "Has sent request to system.";

        Assert.assertEquals(expected, user.new Query().printToLog());
    }

    @Test
    public void printToLog_testB(){
        Object expected = "The user login: " + user.getLogin() + "\n" +
                "password: " + user.getPassword() + "\n" +
                "Has sent request to system.";

        Assert.assertEquals(expected, query.printToLog());
    }

}
