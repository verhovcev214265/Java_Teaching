package org.teaching.essential.lecture2_classes_p2.task4;

/*
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
 */

public class Car {

    private int yearProduction;
    private double speed;
    private int weight;
    private String color;

    public Car(){}

    public Car(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Car(int yearProduction, double speed) {
        this.yearProduction = yearProduction;
        this.speed = speed;
    }

    public Car(int yearProduction, double speed, int weight) {
        this.yearProduction = yearProduction;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int yearProduction, double speed, int weight, String color) {
        this.yearProduction = yearProduction;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
