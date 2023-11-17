package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    private Shape circle;

    @Before
    public void setUp(){
        circle = new Circle(2.0);
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(circle);
        Assert.assertTrue(circle instanceof Shape);
    }

    @Test
    public void shouldReturn_Area(){
        Assert.assertEquals(12.56, circle.area(), 0.001);
    }
}
