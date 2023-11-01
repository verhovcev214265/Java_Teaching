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

    @Test
    public void checkMagnificationArray(){
        myDictionary.addElement("країна", "country");
        myDictionary.addElement("область", "district");
        myDictionary.addElement("місто", "city");
        myDictionary.addElement("вулиця", "street");

        Assert.assertEquals(4, myDictionary.getSize());

        myDictionary.addElement("автомобіль", "car");
        myDictionary.addElement("літак", "plane");

        Assert.assertEquals(6, myDictionary.getSize());
    }

    @Test
    public void get_test(){
        myDictionary.addElement("країна", "country");

        expected.addElement("країна", "country");

        Assert.assertEquals(myDictionary.getElement(0), expected.getElement(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturn_ExceptionMessage_When_InputHasNegativeArgument(){
        myDictionary.addElement("автомобіль", "car");
        myDictionary.addElement("літак", "plane");

        myDictionary.getElement(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturn_ExceptionMessage_When_InputHasBiggerNumber_Than_ArrayLength(){
        myDictionary.addElement("автомобіль", "car");
        myDictionary.addElement("літак", "plane");

        myDictionary.getElement(2);
    }

    @Test
    public void check_getSize(){
        myDictionary.addElement("країна", "country");
        myDictionary.addElement("область", "district");
        myDictionary.addElement("місто", "city");
        myDictionary.addElement("вулиця", "street");

        Assert.assertEquals(4, myDictionary.getSize());
    }
}
