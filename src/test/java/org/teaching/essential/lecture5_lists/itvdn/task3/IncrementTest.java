package org.teaching.essential.lecture5_lists.itvdn.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        System.out.println(numbers);
    }

    @Test
    public void shouldReturn_IncrementedNumbers(){
        List<Integer> expected = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            expected.add(i + 2);
        }

        Assert.assertEquals(expected, increment.incremented(numbers));
        System.out.println(expected + "\n" + numbers);
    }
}
