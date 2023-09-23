package org.teaching.lecture10_generics.additional_nadia.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericTest {

    private Generic<String> generic;

    @Before
    public void setUp(){
        generic = new Generic<>("Hello");
    }

    @Test
    public void show_test(){
        String expected = "Hello";
        Assert.assertEquals(expected.getClass(), generic.show());
    }


}
