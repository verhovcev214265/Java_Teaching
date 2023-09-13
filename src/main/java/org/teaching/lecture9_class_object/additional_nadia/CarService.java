package org.teaching.lecture9_class_object.additional_nadia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private Car[] cars;

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    // a) список марок автомобилей из созданного массива объектов;
    public List<Car> allCars() {
        return Arrays.asList(cars);
    }

    // b) список автомобилей, которые эксплуатируются больше n лет;
    public List<Car> usedCars(int years) {
        List<Car> result = new ArrayList<>();

        int currentYear = 2023;

        for (Car car : cars) {
            if (currentYear - car.getYearOfProduction() > years) {
                result.add(car);
            }
        }
        return result;
    }

    // c) список автомобилей заданного года выпуска, цена которых больше указанной.
    public List<Car> carsOfNeededPrice(int inputYear, double price){
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYearOfProduction() == inputYear && car.getPrice() > price) {
                result.add(car);
            }
        }
        return result;
    }

    /*
    d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)
    и саму характеристику автомобиля (используя toString())
     */
    public int similarCars(){
        int result = 1;
        for (int i = 0; i < (cars.length - 1); i++) {
            if (cars[i].equals(cars[i + 1])){
                result++;
            }
        }
        return result;
    }
}
