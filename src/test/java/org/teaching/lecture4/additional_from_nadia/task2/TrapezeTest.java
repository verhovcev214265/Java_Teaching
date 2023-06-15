package org.teaching.lecture4.additional_from_nadia.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrapezeTest {

    private Shape trapeze;

    @Before
    public void setUp(){
        trapeze = new Trapeze(10.0, 5.0, 2.0);
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(trapeze);
        Assert.assertTrue(trapeze instanceof Shape);
    }

    @Test
    public void shouldReturn_Area(){
        Assert.assertEquals(15.0, trapeze.area(), 0.001);
    }
}
