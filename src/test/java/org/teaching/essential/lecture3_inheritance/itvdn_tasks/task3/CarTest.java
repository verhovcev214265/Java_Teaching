package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    private Vehicle car;

    @Before
    public void setUp(){
        car = new Car(1000.99, 250, 2022);
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals(1000.99, car.getPrice(), 0.0001);
        Assert.assertEquals(250, car.getSpeed());
        Assert.assertEquals(2022, car.getYearProduction());
    }
}
