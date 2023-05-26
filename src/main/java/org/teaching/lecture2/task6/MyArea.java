package org.teaching.lecture2.task6;

/*
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.
 */

public class MyArea {

    private static final double PI = 3.14;

    public static double areaOfCircleA(double radius){
        return PI * (Math.pow(radius, 2));
    }
}
