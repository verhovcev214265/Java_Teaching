package org.teaching.essential.lecture9_class_object.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeviceTest {

    private Device device;

    @Before
    public void setUp(){
        device = new Device("Samsung", 120.0f, "AB1234567CD");
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Samsung", device.getManufacturer());
        Assert.assertEquals(120.0f, device.getPrice(), 0.0001);
        Assert.assertEquals("AB1234567CD", device.getSerialNumber());
    }

    @Test
    public void checkHashCodes(){
        Device deviceB = new Device("Samsung", 120.0f, "AB1234567CD");
        Assert.assertEquals(device.hashCode(), deviceB.hashCode());
    }
}
