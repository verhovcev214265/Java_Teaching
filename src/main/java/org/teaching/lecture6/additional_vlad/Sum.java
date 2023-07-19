package org.teaching.lecture6.additional_vlad;

public class Sum {

    public String getOddOrEven(int[] numbers) {
        try {
            if (numbers.length == 0) {
                throw new Exception();
            }

            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }

            if (sum % 2 == 0) return "even";

            return "odd";
        } catch (Exception e) {
            return "even";
        }
    }
}
