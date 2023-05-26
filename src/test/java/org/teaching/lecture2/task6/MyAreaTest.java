package org.teaching.lecture2.task6;

/*
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.
 */

import org.junit.Assert;
import org.junit.Test;

public class MyAreaTest {

    @Test
    public void shouldReturn_areaOfCircle(){
        double expected = 12.56;
        Assert.assertEquals(expected, MyArea.areaOfCircleA(2.0), 0.0001);
    }
}
