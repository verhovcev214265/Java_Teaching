package org.teaching.lecture2.task3;

/*
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    private Car carA;
    private Car carB;
    private Car carC;

    @Before
    public void setUp(){
        carA = new Car();
        carB = new Car(2005);
        carC = new Car(2008, "Black");
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(carA);
        Assert.assertNotNull(carB);
        Assert.assertNotNull(carC);
    }

    @Test
    public void checkDefaultConstructor(){
        Assert.assertEquals(0, carA.getYearProduction());
        Assert.assertNull(carA.getColor());
    }

    @Test
    public void checkConstructor_WithOneParameter(){
        int expected = 2005;

        Assert.assertEquals(expected, carB.getYearProduction());
        Assert.assertNull(carB.getColor());
    }

    @Test
    public void checkConstructor_WithTwoParameters(){
        int expectedYear = 2008;
        String expectedColor = "Black";

        Assert.assertEquals(expectedYear, carC.getYearProduction());
        Assert.assertEquals(expectedColor, carC.getColor());
    }
}
