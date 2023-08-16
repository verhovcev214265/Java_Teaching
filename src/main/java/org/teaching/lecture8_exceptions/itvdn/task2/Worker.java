package org.teaching.lecture8_exceptions.itvdn.task2;
/*
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
 */

import java.time.Year;

public class Worker implements Comparable<Worker>{

    private String name;
    private String sureName;
    private String position;
    private Year startYear;

    public Worker(String name, String sureName, String position, int yearIntoWork) {
        this.name = name;
        this.sureName = sureName;
        this.position = position;
        this.startYear = Year.of(yearIntoWork);
    }

    @Override
    public int compareTo(Worker other) {
        return this.sureName.compareTo(other.sureName);
    }

    public Year getStartYear() {
        return startYear;
    }

    public String getSureName() {
        return sureName;
    }

    @Override
    public String toString() {
        return "Worker - " +
                "name: " + name +
                ", surname: " + sureName +
                ", position: " + position +
                ", year of entry into work: " + startYear + ".";
    }
}
