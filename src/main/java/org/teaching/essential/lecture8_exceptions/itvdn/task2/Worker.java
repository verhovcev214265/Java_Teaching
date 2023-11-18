package org.teaching.essential.lecture8_exceptions.itvdn.task2;
/*
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
 */

public class Worker implements Comparable<Worker>{

    private final String name;
    private final String surname;
    private final String position;
    private final int startYear;

    public Worker(String name, String sureName, String position, int startYear) {
        this.name = name;
        this.surname = sureName;
        this.position = position;
        this.startYear = startYear;
    }

    @Override
    public int compareTo(Worker other) {
        return this.surname.compareTo(other.surname);
    }

    public int getStartYear() {
        return startYear;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Worker - " +
                "name: " + name +
                ", surname: " + surname +
                ", position: " + position +
                ", year of entry into work: " + startYear + ".";
    }
}
