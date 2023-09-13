package org.teaching.lecture9_class_object.additional_nadia;

/*
Приложение при старте, выводит в консоли текстовое меню для выполнения
пользователем нижеперечисленных операций.
Вывести:
a) список марок автомобилей из созданного массива объектов;
b) список автомобилей, которые эксплуатируются больше n лет;
c) список автомобилей заданного года выпуска, цена которых больше указанной.
d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив) и саму характеристику автомобиля (используя toString())

Постройте структуру меню приложения таким образом, чтобы пользователь
мог последовательно вводить параметры поиска и получать результат. После
выполнения выбранной операции, на экран должен выводиться результат и
снова пользователю предлагается выполнить одну из операций до тех пор,
пока пользователь выполнить выход из приложения.
 */

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        CarService carService = new CarService();
        carService.setCars(new Car[]{
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                new Car(1, "Opel", "Cadet", 2010, "red", 500.0, 111),
                new Car(2, "Mercedes", "E300", 2015, "black", 2500.0, 222),
                new Car(3, "BMW", "X5", 2017, "white", 15500.0, 333)
        });

        boolean exit = false;
        try (Scanner scan = new Scanner(System.in)) {
            while (!exit) {
                logger.info("Choose the action:\n" +
                        "1 - list of all cars;\n" +
                        "2 - list of cars that have been using more than 'n' years.\n" +
                        "3 - list of cars the specified year of production the price of which more than specified price\n" +
                        "4 - list of similar cars if to compare with first car\n" +
                        "Exit - press any button.");
                String action = scan.next();

                switch (action) {
                    case "1":
                        List<String> allCars = carService.allCars();
                        logger.info(allCars.toString());
                        break;
                    case "2":
                        logger.info("Enter years of using:");
                        int yearsOfUsing = scan.nextInt();
                        List<Car> usedCars = carService.usedCars(yearsOfUsing);
                        logger.info(usedCars.toString());
                        break;
                    case "3":
                        logger.info("Enter year of production :");
                        int yearOfProduction = scan.nextInt();
                        logger.info("Enter price:");
                        double price = scan.nextDouble();
                        List<Car> carsOfPrice = carService.carsOfNeededPrice(yearOfProduction, price);
                        logger.info(carsOfPrice.toString());
                        break;
                    case "4":
                        int similarCars = carService.similarCars();
                        logger.info(
                                "Numbers of similar cars = " + similarCars + "\n" +
                                        "Characteristics of the cars: " + carService.getCars()[0].toString()
                        );
                        break;
                    default:
                        logger.info("Bye - bye");
                        exit = true;
                        break;
                }
            }
        }
    }
}

