package org.teaching.lecture10_generics.itvdn.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MyDictionaryTest {

    private MyDictionary<String, String> myDictionary;
    private List<String> expectedKey;
    private List<String> expectedValue;


    @Before
    public void setUp(){
        myDictionary = new MyDictionary<>(6);
        expectedKey = Arrays.asList("країна", "місто", "street");
        expectedValue = Arrays.asList("country", "city", "street");
    }

    @Test
    public void add_test(){

    }
}
