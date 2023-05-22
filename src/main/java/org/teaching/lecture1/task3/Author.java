package org.teaching.lecture1.task3;

/*
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */

public class Author {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }
}
