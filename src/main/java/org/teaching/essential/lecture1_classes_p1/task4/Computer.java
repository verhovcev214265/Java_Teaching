package org.teaching.essential.lecture1_classes_p1.task4;

/*
Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
(используя loop)
 */

public class Computer {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
