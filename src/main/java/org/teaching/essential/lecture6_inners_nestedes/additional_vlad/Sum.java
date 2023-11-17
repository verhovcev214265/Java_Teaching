package org.teaching.essential.lecture6_inners_nestedes.additional_vlad;

/*
Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).
 */

public class Sum {

    private static final String EVEN = "even";
    private static final String ODD = "odd";

    public String getOddOrEven(int[] numbers) {

        if (numbers == null || numbers.length == 0) return EVEN;

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        if (sum % 2 == 0) return EVEN;

        return ODD;

    }
}

