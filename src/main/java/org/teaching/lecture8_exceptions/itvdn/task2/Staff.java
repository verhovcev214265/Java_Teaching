package org.teaching.lecture8_exceptions.itvdn.task2;

/*
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
быть упорядочены по алфавиту);
 если значение года введено не в соответствующем формате выдает исключение. ???
 вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */

import org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staff {
    private static final Logger logger = LoggerFactory.getLogger(Staff.class);
    private final Worker[] workers;
    private int numbersOfWorkers;
    private Scanner scan;

    public Staff(int numbersOfWorkers){
        if (numbersOfWorkers > 5){
            logger.error("The number of the workers shouldn't be more than 5 - persons. You've entered: {}", numbersOfWorkers);
            throw new IllegalArgumentException("The number of the workers shouldn't be more than 5 - persons. You've entered: " + numbersOfWorkers);
        }

        workers = new Worker[numbersOfWorkers];
    }

    public void setWorker(Worker worker) throws NumberFormatException{
        numbersOfWorkers++;

        if (numbersOfWorkers > workers.length){
            logger.error("You can't add another worker because array of workers are full!");
            return;
        }

        logger.info("Enter name:");
        String name = scan.next();

        logger.info("Enter surname:");
        String surname = scan.next();

        logger.info("Enter position:");
        String position = scan.next();

        logger.info("Enter year of starting work:");
        String year = scan.next();

        this.workers[numbersOfWorkers - 1] = new Worker(name, surname, position, Integer.parseInt(year));
    }

    public List<String> calculateExperience(int requiredExperience){

        List<String> relevantWorkers = new ArrayList<>();

        int currentYear = Year.now().getValue();

        for (Worker worker : workers) {

            int currentExperience = currentYear - worker.getStartYear();

            if (currentExperience > requiredExperience) {
                relevantWorkers.add(worker.getSurname());
            }
        }

        return relevantWorkers;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setScan(Scanner scan){
        this.scan = scan;
    }

}
