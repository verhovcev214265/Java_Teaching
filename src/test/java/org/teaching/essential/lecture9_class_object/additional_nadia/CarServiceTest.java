package org.teaching.essential.lecture9_class_object.additional_nadia;

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
        carService = new CarService();

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
    public void marksOfAllCars_test(){
        List<String> expected = Arrays.asList("Opel", "Opel", "Mercedes", "BMW");
        Assert.assertEquals(expected, carService.marksOfAllCars());
    }

    @Test
    public void usedCars_test(){
        List<Car> expected = Arrays.asList(
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                new Car(2, "Mercedes", "E300", 2015, "black", 2500.0, 222)
        );
        Assert.assertEquals(expected, carService.usedCars(7));
    }

    @Test
    public void carsOfNeededPrice_test(){
        List<Car> expected = Arrays.asList(
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111)
        );
        Assert.assertEquals(expected, carService.carsOfNeededPrice(2010, 499.99));
    }

    @Test
    public void shouldReturnEmptyList_WhenCarWithPutParameters_DoesNotExistIntoTheList(){
        List<Car> expected = new ArrayList<>();
        Assert.assertEquals(expected, carService.carsOfNeededPrice(2023, 500_000.03));
    }

    @Test
    public void similarCarsTest(){
        Assert.assertEquals(2, carService.similarCars());
    }
}
