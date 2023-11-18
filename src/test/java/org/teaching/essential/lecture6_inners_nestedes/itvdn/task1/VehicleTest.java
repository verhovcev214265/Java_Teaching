package org.teaching.essential.lecture6_inners_nestedes.itvdn.task1;

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
    public void print_test(){
        Assert.assertEquals("Vehicle has printed", vehicle.print());
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
