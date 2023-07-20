package org.teaching.lecture6.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistanceTest {

    private Distance.Converter converter;

    @Before
    public void setUp(){
        converter = new Distance.Converter();
    }

    @Test
    public void toKilometers_test(){
        Assert.assertEquals(1.0, converter.toKilometers(1000.0), 0.0001);
        Assert.assertEquals(converter.toKilometers(1000.0), Distance.getDistance(), 0.0001);
    }

    @Test
    public void toMiles_test(){
        Assert.assertEquals(62.1, converter.toMiles(100.0), 0.0001);
        Assert.assertEquals(converter.toMiles(100.0), Distance.getDistance(), 0.0001);
    }

}
