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
        myListInt = new MyList<>(3);
        expectedStr = Arrays.asList("Hello", "my", "world!");
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

}
