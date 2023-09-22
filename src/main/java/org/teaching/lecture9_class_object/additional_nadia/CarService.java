package org.teaching.lecture9_class_object.additional_nadia;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private Car[] cars;

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    public List<String> marksOfAllCars() {
        List<String> result = new ArrayList<>();

        for (Car car : cars) {
            result.add(car.getMark());
        }
        return result;
    }

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

    public List<Car> carsOfNeededPrice(int inputYear, double price){
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYearOfProduction() == inputYear && car.getPrice() > price) {
                result.add(car);
            }
        }
        return result;
    }

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
