package org.teaching.lecture7_anonymous_enums.itvdn.task1;

import org.junit.Assert;
import org.junit.Test;

public class VehiclesTest {

    private Vehicles vehicle;

    @Test
    public void bmw_test(){
        vehicle = Vehicles.BMW;

        Assert.assertEquals("Vehicle BMW, color is Black, price = 10000.", vehicle.toString());
        Assert.assertEquals("Black", vehicle.getColor());
    }

    @Test
    public void opel_test(){
        vehicle = Vehicles.OPEL;

        Assert.assertEquals("Vehicle OPEL, color is Red, price = 3000.", vehicle.toString());
        Assert.assertEquals("Red", vehicle.getColor());
    }


}
