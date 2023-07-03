package org.teaching.lecture5.aditional_nadia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter list size:");
        Scanner scan = new Scanner(System.in);

        int listSize = scan.nextInt();

        ListManipulation listManipulation = new ListManipulation(new ArrayList<>(listSize));

        for (int i = 0; i < listSize; i++) {
            System.out.println("Enter the " + i + " number:");

            int currentNumber = scan.nextInt();
            listManipulation.getNumbers().add(currentNumber);
        }

        System.out.println(

                listManipulation.getNumbers() + "\n" +

                "Choose the action: \n" +
                        "1 - Add element;\n" +
                        "2 - Delete element;\n" +
                        "3 - Show all elements of the list;\n" +
                        "4 - Check is exist a value of the list;\n" +
                        "5 - Change a value of the list."
        );

        int action = scan.nextInt();

        System.out.println("Enter element:");
        int element = scan.nextInt();

        System.out.println("Enter index:");
        int index = scan.nextInt();

        listManipulation.performActions(action, element, index);
        
    }
}
