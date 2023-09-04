package org.teaching.lecture3_inheritance.itvdn_tasks.task3;

// Для класса Plane должна быть определена высота и количество пассажиров.

public class Plane extends Vehicle{

    private final double height;
    private final int passengers;

    public Plane(double price, int speed, int yearProduction, double height, int passengers){
        super(price, speed, yearProduction);
        this.height = height;
        this.passengers = passengers;
    }

    public double getHeight() {
        return height;
    }

    public int getPassengers() {
        return passengers;
    }
}
