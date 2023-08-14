package org.teaching.lecture8_exceptions.itvdn.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff(5);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < staff.getWorkers().length; i++) {
            System.out.println("Enter name: ");
            String name = scan.next();

            System.out.println("Enter surname: ");
            String surname = scan.next();

            System.out.println("Enter position: ");
            String position = scan.next();

            System.out.println("Enter year of starting work: ");
            int year = scan.nextInt();

            staff.setWorker(new Worker(name, surname, position, year));
        }

        for (int i = 0; i < staff.getWorkers().length; i++) {
            System.out.print(staff.getWorkers()[i] + "\n");
        }
    }

}
