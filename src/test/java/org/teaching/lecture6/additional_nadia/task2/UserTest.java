package org.teaching.lecture6.additional_nadia.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("Petro", 1234);
    }

    @Test
    public void createQuery_test() {
        Object expected = "The user login: " + user.getLogin() + "\n" +
                "password: " + user.getPassword() + "\n" +
                "Has sent request to system.";

        Assert.assertEquals(expected, user.createQuery());
    }
}
