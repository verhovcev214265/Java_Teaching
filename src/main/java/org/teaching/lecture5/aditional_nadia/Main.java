package org.teaching.lecture5.aditional_nadia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter list size:");
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " number:");

            int current = scan.nextInt();
            numbers.add(current);
        }

        System.out.println(
                "Choose the action: \n" +
                        "1 - Add element;\n" +
                        "2 - Delete element;\n" +
                        "3 - Show all elements of the list;\n" +
                        "4 - Check is exist a value of the list;\n" +
                        "5 - Change a value of the list."
        );

    }
}
