package org.teaching.lecture3.itvdn_tasks.task3;

/*
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

    private Vehicle vehicle;

    @Before
    public void setUp(){
        vehicle = new Vehicle(2000.99, 500, 2019);
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals(2000.99, vehicle.getPrice(), 0.0001);
        Assert.assertEquals(500, vehicle.getSpeed());
        Assert.assertEquals(2019, vehicle.getYearProduction());
    }
}
