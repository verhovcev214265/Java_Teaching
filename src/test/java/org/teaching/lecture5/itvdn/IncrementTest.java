package org.teaching.lecture5.itvdn;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.teaching.Lecture5.itvdn.task3.Increment;

import java.util.ArrayList;
import java.util.List;

public class IncrementTest {

    private Increment increment;
    private List<Integer> numbers;

    @Before
    public void setUp(){
        increment = new Increment();
        numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i + 1);
        }
    }

    @Test
    public void shouldReturn_IncrementedNumbers(){
        List<Integer> expected = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            expected.add(i + 2);
        }

        Assert.assertEquals(expected, increment.incremented(numbers));
    }
}
