package org.teaching.essential.lecture2_classes_p2.task5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private Car carA;
    private Car carB;
    private Car carC;
    private Car carD;
    private Car carE;

    @Before
    public void setUp(){
        carA = new Car();
        carB = new Car(2005);
        carC = new Car(2006, 220.0);
        carD = new Car(2007, 230.0, 1000);
        carE = new Car(2008, 240.0, 1100, "Blue");
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(carA);
        Assert.assertNotNull(carB);
        Assert.assertNotNull(carC);
        Assert.assertNotNull(carD);
        Assert.assertNotNull(carE);
    }

    @Test
    public void checkDefaultConstructor(){
        Assert.assertEquals(0, carA.getYearProduction());
        Assert.assertEquals(0.0, carA.getSpeed(), 0.001);
        Assert.assertEquals(0, carA.getWeight());
        Assert.assertNull(carA.getColor());
    }

    @Test
    public void checkConstructor_WithOnesParameter(){
        int expected = 2005;

        Assert.assertEquals(expected, carB.getYearProduction());
        Assert.assertEquals(0.0, carB.getSpeed(), 0.001);
        Assert.assertEquals(0, carB.getWeight());
        Assert.assertNull(carB.getColor());
    }

    @Test
    public void checkConstructor_WithTwiceParameters(){
        int expectedYear = 2006;
        int expectedSpeed = 220;

        Assert.assertEquals(expectedYear, carC.getYearProduction());
        Assert.assertEquals(expectedSpeed, carC.getSpeed(), 0.001);
        Assert.assertEquals(0, carC.getWeight());
        Assert.assertNull(carC.getColor());
    }

    @Test
    public void checkConstructor_WithThreeParameters(){
        int expectedYear = 2007;
        int expectedSpeed = 230;
        int expectedWeight = 1000;

        Assert.assertEquals(expectedYear, carD.getYearProduction());
        Assert.assertEquals(expectedSpeed, carD.getSpeed(), 0.001);
        Assert.assertEquals(expectedWeight, carD.getWeight());
        Assert.assertNull(carD.getColor());
    }

    @Test
    public void checkConstructor_WithFourthParameters(){
        int expectedYear = 2008;
        int expectedSpeed = 240;
        int expectedWeight = 1100;
        String expectedColor = "Blue";

        Assert.assertEquals(expectedYear, carE.getYearProduction());
        Assert.assertEquals(expectedSpeed, carE.getSpeed(), 0.001);
        Assert.assertEquals(expectedWeight, carE.getWeight());
        Assert.assertEquals(expectedColor, carE.getColor());
    }
}
