package org.teaching.lecture4.itvdn.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PresidentTest {

    private Employer president;

    @Before
    public void setUp(){
        president = new President();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(president);
        Assert.assertTrue(president instanceof Employer);
    }

    @Test
    public void shouldReturnProfession(){
        String expected = "I'm president.";

        Assert.assertEquals(expected, president.print());
    }
}
