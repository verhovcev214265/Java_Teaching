package org.teaching.lecture8_exceptions.itvdn.task2;

/*
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
быть упорядочены по алфавиту);
 если значение года введено не в соответствующем формате выдает исключение.
 вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */

import org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Staff {
    private static final Logger LOGGER = LoggerFactory.getLogger(Staff.class);

    private final Worker[] workers;
    private int numbersOfWorkers;
    private Scanner scan;

    public Staff(int numbersOfWorkers){
        if (numbersOfWorkers > 5){
            LOGGER.error("The number of the workers shouldn't be more than 5 - persons. You've entered: {}", numbersOfWorkers);
            throw new IllegalArgumentException("The number of the workers shouldn't be more than 5 - persons. You've entered: " + numbersOfWorkers);
        }

        workers = new Worker[numbersOfWorkers];
    }

    public void setWorker(Worker worker){
        numbersOfWorkers++;

        if (numbersOfWorkers > workers.length){
            LOGGER.error("You can't add another worker because array of workers are full!");
            return;
        }

        LOGGER.info("Enter name:");
        String name = scan.next();

        LOGGER.info("Enter surname:");
        String surname = scan.next();

        LOGGER.info("Enter position:");
        String position = scan.next();

        LOGGER.info("Enter year of starting work:");
        int year = scan.nextInt();

        this.workers[numbersOfWorkers - 1] = new Worker(name, surname, position, year);
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setScan(Scanner scan){
        this.scan = scan;
    }
}
