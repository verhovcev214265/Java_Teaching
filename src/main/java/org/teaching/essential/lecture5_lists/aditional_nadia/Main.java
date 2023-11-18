package org.teaching.essential.lecture5_lists.aditional_nadia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter list size:");
        Scanner scan = new Scanner(System.in);

        int inputListSize = scan.nextInt();

        ListManipulation listManipulation = new ListManipulation();
        listManipulation.setScan(scan);

        for (int i = 0; i < inputListSize; i++) {
            System.out.println("Enter the " + (i + 1) + " number:");

            int inputCurrentNumber = scan.nextInt();
            listManipulation.getNumbers().add(inputCurrentNumber);
        }

        boolean isRunning;

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

            int action = scan.nextInt();

            isRunning = listManipulation.performActions(action);
        } while (isRunning);
    }

}
