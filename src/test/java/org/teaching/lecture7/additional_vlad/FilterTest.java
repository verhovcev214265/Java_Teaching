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
import java.util.Arrays;
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
    public void filteredOutA_test() {

        expected = Arrays.asList(1, 2, 1, 123, 231);
        actual = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);

        Assert.assertEquals(expected, filterList.filteredOutA(actual));
    }

    @Test
    public void filteredOutB_test(){

        expected = Arrays.asList(1, 2, 1, 123, 231);
        actual = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);

        Assert.assertEquals(expected, filterList.filteredOutB(actual));
    }

    @Test
    public void filteredOutA_timeTest(){
        long start, finish;
        int iterations = 1_000_000;

        expected = Arrays.asList(1, 2, 1, 123, 231);
        actual = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);

        List<Integer> result = null;

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            result = filterList.filteredOutA(actual);
        }
        finish = System.nanoTime() - start;

        Assert.assertEquals(expected, result);
        System.out.println("Avg time for one operation = " + (finish / iterations) + " nanoseconds");

    }

    @Test
    public void filteredOutB_timeTest(){
        long start, finish;
        int iterations = 100;

        expected = Arrays.asList(1, 2, 1, 123, 231);
        actual = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);

        List<Integer> result = null;

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            result = filterList.filteredOutB(actual);
        }
        finish = System.nanoTime() - start;

        Assert.assertEquals(expected, result);
        System.out.println("Avg time for one operation = " + (finish / iterations) + " nanoseconds");

    }

}
