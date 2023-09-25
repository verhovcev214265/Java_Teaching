package org.teaching.lecture10_generics.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MyListTest {

    private MyList<String> myListStr;
    private MyList<Integer> myListInt;

    private List<String> expectedStr;
    private List<Integer> expectedInt;

    @Before
    public void setUp(){
        myListStr = new MyList<>(3);
        expectedStr = Arrays.asList("Hello", "my", "world!");

        myListInt = new MyList<>(3);
        expectedInt = Arrays.asList(44, 43, 22);
    }

    @Test
    public void add_test_Strings(){
        myListStr.add("Hello");
        myListStr.add("my");
        myListStr.add("world!");

        for (int i = 0; i < myListStr.getElements().length; i++) {
            Assert.assertEquals(myListStr.getElements()[i], expectedStr.get(i));
        }
    }

    @Test
    public void add_test_Integers(){
        myListInt.add(44);
        myListInt.add(43);
        myListInt.add(22);

        for (int i = 0; i < myListInt.getElements().length; i++) {
            Assert.assertEquals(myListInt.getElements()[i], expectedInt.get(i));
        }
    }

    @Test
    public void checkMagnificationArray(){
        MyList<Integer> instance = new MyList<>(4);
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        Assert.assertEquals(4, instance.getSize());

        instance.add(5);
        Assert.assertEquals(5, instance.getSize());
    }

    @Test
    public void get_test(){
        MyList<String> instance = new MyList<>(2);
        instance.add("Hello");
        instance.add("World!");

        Assert.assertEquals("Hello", instance.getIndex(0));
        Assert.assertEquals("World!", instance.getIndex(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturn_ExceptionMessage_When_InputHasNegativeArgument(){
        MyList<Integer> instance = new MyList<>(2);
        instance.add(1);
        instance.add(2);

        instance.getIndex(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturn_ExceptionMessage_When_InputHasBiggerNumber_Than_ArrayLength(){
        MyList<Integer> instance = new MyList<>(2);
        instance.add(1);
        instance.add(2);

        instance.getIndex(2);
    }

    @Test
    public void checkGetSize(){
        MyList<String> instance = new MyList<>(2);
        instance.add("Hello");
        instance.add("my");
        instance.add("beautiful");
        instance.add("World!");

        Assert.assertEquals(4, instance.getSize());
    }

}
