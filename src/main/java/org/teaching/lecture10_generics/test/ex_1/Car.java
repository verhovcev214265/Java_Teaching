package org.teaching.lecture10_generics.test.ex_1;

public class Car {
    private final String model;
    private final int yearOfProduction;

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString(){
        return "Car: " + model + ", year of production = " + yearOfProduction + ".";
    }
}
