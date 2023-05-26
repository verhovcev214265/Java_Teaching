package org.teaching.lecture1.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

    private Rectangle rectangle;
    double sideA;
    double sideB;
    double result;

    @Before
    public void beforeMethod(){
        rectangle = new Rectangle();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(rectangle);
    }

    @Test
    public void rectangleArea_test() {
        sideA = 5.0;
        sideB = 2.0;
        result = 10.0;

        Assert.assertEquals(result, rectangle.getArea(sideA, sideB), 0.001);
    }

    @Test
    public void rectanglePerimeter_test() {
        sideA = 5.0;
        sideB = 2.0;
        result = 14.0;

        Assert.assertEquals(result, rectangle.getPerimeter(sideA, sideB), 0.001);
    }

}
