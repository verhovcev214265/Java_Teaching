package org.teaching.lecture3.itvdn_tasks.task3;

// Для класса Plane должна быть определена высота и количество пассажиров.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(500000.99, 689, 2021, 4500.00, 358);
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals(500000.99, plane.getPrice(), 0.0001);
        Assert.assertEquals(689, plane.getSpeed());
        Assert.assertEquals(2021, plane.getYearProduction());
        Assert.assertEquals(4500,plane.getHeight(), 0.0001);
        Assert.assertEquals(358, plane.getPassengers());
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(plane);
        Assert.assertTrue(plane instanceof Vehicle);
    }
}
