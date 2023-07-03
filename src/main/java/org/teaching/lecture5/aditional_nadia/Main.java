package org.teaching.lecture5.aditional_nadia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter list size:");
        Scanner scan = new Scanner(System.in);

        String inputListSize = scan.next();
        int listSize = Integer.parseInt(inputListSize);


        ListManipulation listManipulation = new ListManipulation(listSize);
        listManipulation.setSc(scan);

        for (int i = 0; i < listSize; i++) {
            System.out.println("Enter the " + i + " number:");

            String inputCurrentNumber = scan.next();
            int currentNumber = Integer.parseInt(inputCurrentNumber);
            listManipulation.getNumbers().add(currentNumber);
        }

        boolean isExit;

        do {
            System.out.println(

                    listManipulation.getNumbers() + "\n" +

                            "Choose the action: \n" +
                            "1 - Add element;\n" +
                            "2 - Delete element;\n" +
                            "3 - Show all elements of the list;\n" +
                            "4 - Check is exist a value of the list;\n" +
                            "5 - Change a value of the list.\n " +
                            " Any other - to exit."
            );

            String input = scan.next();
            int action = Integer.parseInt(input);

            isExit = listManipulation.performActions(action);
        }while (!isExit);

    }
}
