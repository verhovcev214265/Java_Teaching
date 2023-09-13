package org.teaching.lecture9_class_object.additional_nadia;

/*
Создать класс Car со следующими полями:
• id,
• Марка,
• Модель,
• Год выпуска,
• Цвет,
• Цена,
• Регистрационный номер.

Определить конструкторы и методы setТип(), getТип(), toString(). В классе Car переопределить методы equals и hashCode.
Создать массив объектов.

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {

    private int id;
    private String mark;
    private String model;
    private int yearOfProduction;
    private String color;
    //  private Colors color;
    private double price;
    private int registerNumber;

    public Car() {
    }

    public Car(int id, String mark, String model, int yearOfProduction, String color, double price, int registerNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
//      this.color = Colors.valueOf(color.toLowerCase().replaceAll("[^A-Za-z]+", ""));
        this.price = price;
        this.registerNumber = registerNumber;
    }

    // a) список марок автомобилей из созданного массива объектов;
    public List<Car> allCars(Car[] cars) {
        return Arrays.asList(cars);
    }

    // b) список автомобилей, которые эксплуатируются больше n лет;
    public List<Car> usedCars(Car[] cars, int years) throws IllegalArgumentException{
        List<Car> output = new ArrayList<>();

        int currentYear = 2023;

        for (Car car : cars) {
            if (currentYear - car.getYearOfProduction() > years) {
                output.add(car);
            }
        }
        return output;
    }

    // c) список автомобилей заданного года выпуска, цена которых больше указанной.
    public List<Car> carsOfNeededPrice(Car[] cars, int inputYear, double price) throws IllegalArgumentException{
        List<Car> output = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYearOfProduction() == inputYear && car.getPrice() > price) {
                output.add(car);
            }
        }
        return output;
    }

    /*
    d) количество одинаковых автомобилей сравнивая с первым автомобилем (который помещен в массив)
    и саму характеристику автомобиля (используя toString())
     */
    public int similarCars(Car[] cars){
        int temp = 1;
        for (int i = 0; i < (cars.length - 1); i++) {
            if (cars[i].equals(cars[i + 1])){
                temp++;
            }
        }
        return temp;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id = " + id +
                ", mark = '" + mark +
                ", model = '" + model +
                ".yearOfProduction = " + yearOfProduction +
                ", color = " + color +
                ", price = " + price +
                ", registerNumber = " + registerNumber + "\n";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Car)) return false;
        Car car = (Car) other;
        return id == car.id && yearOfProduction == car.yearOfProduction && Double.compare(car.price, price) == 0 &&
                registerNumber == car.registerNumber && mark.equals(car.mark) && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, yearOfProduction, color, price, registerNumber);
    }
}
