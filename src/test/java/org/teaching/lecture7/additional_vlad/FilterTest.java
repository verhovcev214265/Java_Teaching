package org.teaching.lecture7.additional_vlad;

/*
Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {

    private Filter filterList;
    private List<Integer> expected;
    private List<Object> actual;

    @Before
    public void setUp() {
        filterList = new Filter();
        expected = new ArrayList<>();
    }

    @Test
    public void filteredOut_testA() {

        actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add("a");
        actual.add("b");

        expected.add(1);
        expected.add(2);

        Assert.assertEquals(expected, filterList.filteredOut(actual));
    }

    @Test
    public void filteredOut_testB() {
        actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add("a");
        actual.add("b");
        actual.add(0);
        actual.add(15);

        expected.add(1);
        expected.add(2);
        expected.add(0);
        expected.add(15);

        Assert.assertEquals(expected, filterList.filteredOut(actual));
    }

    @Test
    public void filteredOut_testC() {

        actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add("a");
        actual.add("b");
        actual.add("aasf");
        actual.add("1");
        actual.add("123");
        actual.add(231);

        expected.add(1);
        expected.add(2);
        expected.add(1);
        expected.add(123);
        expected.add(231);

        Assert.assertEquals(expected, filterList.filteredOut(actual));
    }

}
