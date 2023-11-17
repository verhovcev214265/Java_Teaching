package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    private Shape rectangle;

    @Before
    public void setUp(){
        rectangle = new Rectangle(10.0, 5.0);
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(rectangle);
        Assert.assertTrue(rectangle instanceof Shape);
    }

    @Test
    public void shouldReturn_Area(){
        Assert.assertEquals(50.0, rectangle.area(), 0.001);
    }
}
