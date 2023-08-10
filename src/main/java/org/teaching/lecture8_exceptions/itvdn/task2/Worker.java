package org.teaching.lecture8_exceptions.itvdn.task2;
/*
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
 */

import java.time.LocalDate;

public class Worker implements Comparable<Worker>{

    private String name;
    private String sureName;
    private String position;
    private LocalDate yearIntoWork;

    public Worker(String name, String sureName, String position, LocalDate yearIntoWork) {
        this.name = name;
        this.sureName = sureName;
        this.position = position;
        this.yearIntoWork = yearIntoWork;
    }

    @Override
    public int compareTo(Worker other) {
        return this.sureName.compareTo(other.sureName);
    }
}
