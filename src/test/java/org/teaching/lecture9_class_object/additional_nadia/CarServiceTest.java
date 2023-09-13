package org.teaching.lecture9_class_object.additional_nadia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Вывести:
a) список марок автомобилей из созданного массива объектов;
b) список автомобилей, которые эксплуатируются больше n лет;
c) список автомобилей заданного года выпуска, цена которых больше указанной.
d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив) и саму характеристику автомобиля (используя toString())
 */

public class CarServiceTest {

    private CarService carService;

    @Before
    public void setUp(){
        carService.setCars(
                new Car[]{
                        new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                        new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                        new Car(2, "Mercedes", "E300", 2015, "black", 2500.0, 222),
                        new Car(3, "BMW", "X5", 2017, "white", 15500.0, 333)
                }
        );
    }

    @Test
    public void shouldReturn_MarksOfAllCars_FromTheArray(){
        List<String> expected = Arrays.asList("Opel", "Opel", "Mercedes", "BMW");
        List<String> actual = carService.allCars();

        Assert.assertEquals(expected, actual);
    }


}
