package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task3;

/*
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
 */

public class Vehicle {

    private final double price;
    private final int speed;
    private final int yearProduction;

    public Vehicle(double price, int speed, int yearProduction) {
        this.price = price;
        this.speed = speed;
        this.yearProduction = yearProduction;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearProduction() {
        return yearProduction;
    }
}
