package org.teaching.lecture10_generics.itvdn.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyDictionaryTest {

    private MyDictionary<String, String> myDictionary;
    private MyDictionary<String, String> expected;

    @Before
    public void setUp(){
        myDictionary = new MyDictionary<>();

        expected = new MyDictionary<>();
        expected.addElement("країна", "country");
        expected.addElement("область", "district");
        expected.addElement("місто", "city");
        expected.addElement("вулиця", "street");

    }

    @Test
    public void add_test(){
        myDictionary.addElement("країна", "country");
        myDictionary.addElement("область", "district");
        myDictionary.addElement("місто", "city");
        myDictionary.addElement("вулиця", "street");

        for (int i = 0; i < myDictionary.getSize(); i++) {
            Assert.assertEquals(expected.getElement(i), myDictionary.getElement(i));
        }
    }
}
