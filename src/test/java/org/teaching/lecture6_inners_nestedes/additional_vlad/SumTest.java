package org.teaching.lecture6_inners_nestedes.additional_vlad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

    private Sum sum;
    private int[] numbers;

    @Before
    public void setUp() {
        sum = new Sum();
    }

    @Test
    public void shouldReturn_Even_WhenArray_isEmpty() {
        Assert.assertEquals("even", sum.getOddOrEven(numbers));
    }

    @Test
    public void checkEven() {
        numbers = new int[]{0, -1, -5};
        Assert.assertEquals("even", sum.getOddOrEven(numbers));
    }

    @Test
    public void checkOdd() {
        numbers = new int[]{0, 1, 4};
        Assert.assertEquals("odd", sum.getOddOrEven(numbers));
    }
}
