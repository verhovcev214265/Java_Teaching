package org.teaching.essential.lecture9_class_object.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternetAdapterTest {

    private InternetAdapter internetAdapter;

    @Before
    public void setUp(){
        internetAdapter = new InternetAdapter(
                "Samsung", 120.0f, "AB1234567CD",65, "3CD469F3-40D7-439A-AD9B-AA5B4A4E2B6C"
        );
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(internetAdapter);
        Assert.assertTrue(internetAdapter instanceof Device);
    }

    @Test
    public void checkObjects(){
        InternetAdapter internetAdapterB = new InternetAdapter(
                "Samsung", 120.0f, "AB1234567CD",65, "3CD469F3-40D7-439A-AD9B-AA5B4A4E2B6C"
        );

        Assert.assertEquals(internetAdapter, internetAdapterB);
    }
}
