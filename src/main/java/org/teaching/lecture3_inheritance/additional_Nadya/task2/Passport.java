package org.teaching.lecture3_inheritance.additional_Nadya.task2;

/*
Создайте класс Passport (паспорт), который будет содержать паспортную информацию о гражданине Украины.
С помощью механизма наследования, реализуйте класс ForeignPassport (загран.паспорт) производный от Passport.
Напомним, что заграничный паспорт содержит помимо паспортных данных, также данные о визах, номер заграничного паспорта.
 */

public class Passport {

    private final String name;
    private final String sureName;
    private final int day;
    private final int month;
    private final int year;

    public Passport(String name, String sureName, int day, int month, int year) {
        this.name = name;
        this.sureName = sureName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
