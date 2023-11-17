package org.teaching.essential.lecture10_generics.additional_nadia.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericTest {

    private Generic<String> genericStr;
    private Generic<Integer> genericInt;

    @Before
    public void setUp(){
        genericStr = new Generic<>("Hello");
        genericInt = new Generic<>(12345);
    }

    @Test
    public void show_ForInt_test(){
        String expected = "Hello";
        Assert.assertEquals(expected.getClass(), genericStr.show());
    }

    @Test
    public void show_ForStr_test(){
        Integer expected = 12345;
        Assert.assertEquals(expected.getClass(), genericInt.show());
    }
}
