package org.teaching.lecture3.itvdn_tasks.task3;

/*
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */

public class Ship extends Vehicle{

    private final int passengers;
    private final String port;

    public Ship(double price, int speed, int yearProduction, int passengers, String port){
        super(price, speed, yearProduction);
        this.passengers = passengers;
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }

    public String getPort() {
        return port;
    }
}
