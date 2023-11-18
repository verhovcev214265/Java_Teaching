package org.teaching.essential.lecture10_generics.additional_nadia.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class MyIteratorTest {

    private MyIterator<Integer> myIterator;

    @Before
    public void setUp(){
        Integer[] numbers = new Integer[]{55, 2, 3, 4, 5};
        myIterator = new MyIterator<>(numbers);
    }
    
    @Test
    public void checkHasNext(){
        Assert.assertTrue(myIterator.hasNext());

        while (myIterator.hasNext()){
            myIterator.next();
        }

        Assert.assertFalse(myIterator.hasNext());
    }

    @Test
    public void checkNext(){
        Integer[] numbersForCheck = new Integer[]{55, 2, 3, 4, 5};

        for (Integer integer : numbersForCheck) {
            Assert.assertEquals(integer, myIterator.next());
        }
        /*
        Assert.assertEquals(Integer.valueOf(55), myIterator.next());
        Assert.assertEquals(Integer.valueOf(2), myIterator.next());
        Assert.assertEquals(Integer.valueOf(3), myIterator.next());
        Assert.assertEquals(Integer.valueOf(4), myIterator.next());
        Assert.assertEquals(Integer.valueOf(5), myIterator.next());
         */
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrough_NoSuchElementException(){
        while (myIterator.hasNext()){
            myIterator.next();
        }
        myIterator.next();
    }
}
