package org.teaching.essential.lecture9_class_object.itvdn.task1;

import java.util.Objects;

/*
Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод
toString, что бы вывод был сдедующим
«Имя: Bob, возраст: 12, хвост: true».
В классе Animal переопределить методы equals & hashCode.
 */

public class Animal {

    private final String name;
    private final int age;
    private final boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (!(other instanceof Animal)) return false;
        Animal animal = (Animal) other;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, tail);
    }
}
