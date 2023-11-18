package org.teaching.essential.lecture9_class_object.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonitorTest {

    private Monitor monitor;

    @Before
    public void setUp(){
        monitor = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(monitor);
        Assert.assertTrue(monitor instanceof Device);
    }

    @Test
    public void checkObjects(){
        Monitor monitorB = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        Assert.assertEquals(monitor, monitorB);
    }
}
