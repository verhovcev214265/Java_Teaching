package org.teaching.lecture7.itvdn.task2;

/*
Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
должен возвращать название экземпляра и возраст животного.
 */

public enum Animals {

    DOG(7), TIGER(9);

    private int age;

    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + super.toString() +
                ", age = " + age;
    }
}
