package org.teaching.lecture2.task1;

/*
Реализуйте класс “Студент”. Необходимо хранить в полях класса: ФИО, дату рождения, контактный телефон, номер группы.
Реализуйте методы класса для ввода данных, вывода данных, реализуйте аксессоры для доступа к отдельным полям,
а также конструктор с параметрами, после создайте несколько обьектов и пощитайте их количество.
 */

public class Student {

    private String name;
    private String sureName;
    private int dataOfBirth;
    private long phoneNumber;
    private int numberOfGroup;

    private static int count;

    public Student(){
        count++;
    }

    public Student(String name, String sureName, int dataOfBirth, long phoneNumber, int numberOfGroup){
        this.name = name;
        this.sureName = sureName;
        this.phoneNumber = phoneNumber;
        this.dataOfBirth = dataOfBirth;
        this.numberOfGroup = numberOfGroup;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(int dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public static int getCount(){
        return count;
    }
}
