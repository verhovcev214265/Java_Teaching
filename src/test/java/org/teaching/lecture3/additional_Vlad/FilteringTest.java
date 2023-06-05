package org.teaching.lecture3.additional_Vlad;

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns
a new list with the strings filtered out.

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilteringTest {

    private Filtering filtering;

    @Before
    public void setUp(){
        filtering = new Filtering();
    }

    @Test
    public void test_stringsFilteredOut_First(){

        List<Object> nonFiltered = new ArrayList<>();
        nonFiltered.add(1);
        nonFiltered.add(2);
        nonFiltered.add("a");
        nonFiltered.add("b");

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        Assert.assertEquals(expected, filtering.stringsFilteredOut(nonFiltered));
    }

    @Test
    public void test_stringsFilteredOut_Second(){
        List<Object> nonFiltered = new ArrayList<>();
        nonFiltered.add(1);
        nonFiltered.add(2);
        nonFiltered.add("a");
        nonFiltered.add("b");
        nonFiltered.add(0);
        nonFiltered.add(15);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(0);
        expected.add(15);

        Assert.assertEquals(expected, filtering.stringsFilteredOut(nonFiltered));
    }

    @Test
    public void test_stringsFilteredOut_Third(){
        List<Object> nonFiltered = new ArrayList<>();
        nonFiltered.add(1);
        nonFiltered.add(2);
        nonFiltered.add("a");
        nonFiltered.add("b");
        nonFiltered.add("aasf");
        nonFiltered.add("1");
        nonFiltered.add("123");
        nonFiltered.add(231);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(231);

        Assert.assertEquals(expected, filtering.stringsFilteredOut(nonFiltered));
    }
}
