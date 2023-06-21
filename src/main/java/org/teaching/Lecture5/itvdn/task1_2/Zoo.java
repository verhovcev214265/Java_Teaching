package org.teaching.Lecture5.itvdn.task1_2;

/*
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль.

Задание 3
Используя Intelij IDEA создать проект, пакет.
Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль
 */

import java.util.ArrayList;

public class Zoo {

    private static final String CAT = "Cat";
    private static final String TIGER = "Tiger";
    private static final String DOG = "Dog";
    private static final String PUMA = "Puma";
    private static final String LION = "Lion";
    private static final String ELEPHANT = "Elephant";
    private static final String MONKEY = "Monkey";
    private static final String PENGUIN = "Penguin";

    public ArrayList<String> addAnimals(ArrayList<String> animals){

        animals.add(0, CAT);
        animals.add(1, TIGER);
        animals.add(2, DOG);
        animals.add(3, PUMA);
        animals.add(4, LION);
        animals.add(5, ELEPHANT);
        animals.add(6, MONKEY);
        animals.add(7, PENGUIN);

        return animals;
    }

    public int removeSomeAnimals(ArrayList<String> animals){
        animals.remove("Dog");
        animals.remove("Lion");
        animals.remove("Penguin");

        return animals.size();
    }
}
