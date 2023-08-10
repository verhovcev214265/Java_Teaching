package org.teaching.lecture8_exceptions.itvdn.task2;

/*
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
быть упорядочены по алфавиту);
 если значение года введено не в соответствующем формате выдает исключение.
 вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class Staff {

    private static final Logger LOGGER = LoggerFactory.getLogger(Staff.class);
    private Scanner scan;

    private int numbersOfWorkers;
    private Worker[] workers;

    public Worker[] workers(int numbersOfWorkers) {
        if (numbersOfWorkers > 5) {
            LOGGER.error("The number of the workers shouldn't be more than 5 persons but you've entered: {}", numbersOfWorkers);
            throw new IllegalArgumentException("The number of the workers shouldn't be more than 5 persons but you've entered: {}" + numbersOfWorkers);
        }
        workers = new Worker[numbersOfWorkers];

        return workers;
    }

    public void createWorker(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            LOGGER.info("Enter name: ");
            String name = scan.next();

            LOGGER.info("Enter sureName: ");
            String sureName = scan.next();

            LOGGER.info("Enter position: ");
            String position = scan.next();

            LOGGER.info("Enter yearIntoWork:");
            int year = scan.nextInt();
            LocalDate yearIntoWork = LocalDate.ofYearDay(year, 5);

            workers[i] = new Worker(name, sureName, position, yearIntoWork);
        }
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
