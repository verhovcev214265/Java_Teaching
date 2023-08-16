package org.teaching.lecture8_exceptions.itvdn.task2;
/*
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
 */

import java.time.Year;

public class Worker implements Comparable<Worker>{

    private final String name;
    private final String surname;
    private final String position;
    private final Year startYear;

    public Worker(String name, String sureName, String position, String yearIntoWork) {
        this.name = name;
        this.surname = sureName;
        this.position = position;

        int startYear = Integer.parseInt(yearIntoWork);
        this.startYear = Year.of(startYear);
    }

    @Override
    public int compareTo(Worker other) {
        return this.surname.compareTo(other.surname);
    }

    public Year getStartYear() {
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
