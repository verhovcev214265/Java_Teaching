package org.teaching.Lecture5.itvdn.task0;

/*
Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
 */

public abstract class Teacher {

    private String name;
    private String surname;

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String aboutTeacher();
}
