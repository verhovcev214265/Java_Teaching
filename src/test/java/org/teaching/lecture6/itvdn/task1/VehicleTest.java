package org.teaching.lecture6.itvdn.task1;

// Создайте экземпляры классов Wheel и Door.

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

    private Vehicle vehicle;

    @Before
    public void setUp(){
        vehicle = new Vehicle();
    }

    @Test
    public void printWheel_test(){
        Assert.assertEquals("Wheel has printed", vehicle.new Wheel().print());
    }

    @Test
    public void printDoor_test(){
        Assert.assertEquals("Door has printed", vehicle.new Door().print());
    }


}
