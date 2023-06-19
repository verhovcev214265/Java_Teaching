package org.teaching.lecture4.additional_from_nadia.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    private Employer manager;

    @Before
    public void setUp(){
        manager = new Manager();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(manager);
        Assert.assertTrue(manager instanceof Employer);
    }

    @Test
    public void shouldReturnProfession(){
        String expected = "I'm manager.";

        Assert.assertEquals(expected, manager.print());
    }
}
