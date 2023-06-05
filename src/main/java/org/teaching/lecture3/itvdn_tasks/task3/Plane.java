package org.teaching.lecture3.itvdn_tasks.task3;

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
