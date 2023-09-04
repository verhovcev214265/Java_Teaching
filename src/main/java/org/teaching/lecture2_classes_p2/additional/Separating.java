package org.teaching.lecture2_classes_p2.additional;

/*
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

public class Separating {

    public boolean checkNotLetters(String word){
        char[] letters = word.toCharArray();

        for (char letter : letters){
            if (!Character.isLetter(letter)){
                return false;
            }
        }
        return true;
    }

    public String splitting(String input) {

        String[] inputElements = input.split("");
        String[] outputElements = new String[inputElements.length];

        for (int i = 0; i < inputElements.length; i++) {
            if (i == 0) {
                outputElements[i] = inputElements[i].toUpperCase();
            } else {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        outputElements[i] = inputElements[i].toUpperCase();
                    } else {
                        outputElements[i] += inputElements[i].toLowerCase();
                    }
                }
            }
        }
        return String.join("-", outputElements);
    }

}

