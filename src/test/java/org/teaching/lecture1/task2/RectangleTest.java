package org.teaching.lecture1.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest {

    private static Rectangle rectangle;
    double side1;
    double side2;
    double result;

    @BeforeClass
    public static void setUp() {
        rectangle = new Rectangle();
    }

    @Before
    public void checkNull(){
        Assert.assertNotNull(rectangle);
    }

    @Test
    public void shouldReturnResult_of_multiplyingBothSides() {
        side1 = 5.0;
        side2 = 2.0;
        result = 10.0;

        Assert.assertEquals(result, rectangle.areaCalculator(side1, side2), 0.001);
    }

    @Test
    public void shouldReturnResult_of_addingBothSides_multipliedByTwo() {
        side1 = 5.0;
        side2 = 2.0;
        result = 14.0;

        Assert.assertEquals(result, rectangle.perimeterCalculator(side1, side2), 0.001);
    }

}
