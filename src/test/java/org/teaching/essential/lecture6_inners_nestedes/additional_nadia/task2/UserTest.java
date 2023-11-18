package org.teaching.essential.lecture6_inners_nestedes.additional_nadia.task2;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void createQuery_test() {
        User user = new User("Petro", 2525);

        Object expected = "The user login: " + user.getLogin() + "\n" +
                "password: " + user.getPassword() + "\n" +
                "Has sent request to system.";

        Assert.assertEquals(expected, user.createQuery());
    }
}
