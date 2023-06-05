package org.teaching.lecture3.itvdn_tasks.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {

    private Ship ship;

    @Before
    public void setUp(){
        ship = new Ship(400000.99, 280, 2023, 3000, "Monte Carlo");
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals(400000.99, ship.getPrice(), 0.0001);
        Assert.assertEquals(280, ship.getSpeed());
        Assert.assertEquals(2023, ship.getYearProduction());
        Assert.assertEquals(3000, ship.getPassengers());
        Assert.assertEquals("Monte Carlo", ship.getPort());
    }
}
