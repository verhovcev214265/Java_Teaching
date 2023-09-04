package org.teaching.lecture3_inheritance.additional_Nadya.task1;

/*
Создать базовый класс «Домашнее животное» и производные классы «Собака», «Кошка»
С помощью конструктора установить имя каждого животного и его характеристики.
Реализуйте для каждого из классов функции:
Sound – издает звук животного (пишем текстом в консоль);
Show – отображает имя животного;
Type – отображает название его подвида
 */

public class Pet {

    private final String name;
    private final String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String sound(){
        return "I can speak";
    }

    public String show(){
        return name;
    }

    public String type(){
        return type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
