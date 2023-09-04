package org.teaching.lecture5_lists.itvdn.task1_2;

/*
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль.

Задание 3
Используя Intelij IDEA создать проект, пакет.
Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ZooTest {

    private Zoo zoo;
    private ArrayList<String> animals;

    @Before
    public void setUp(){
        zoo = new Zoo();
        animals = new ArrayList<>();

        zoo.addAnimals(animals);
    }

    @Test
    public void checkAnimalsIndexes(){

        Assert.assertEquals("Cat", animals.get(0));
        Assert.assertEquals("Tiger", animals.get(1));
        Assert.assertEquals("Dog", animals.get(2));
        Assert.assertEquals("Puma", animals.get(3));
        Assert.assertEquals("Lion", animals.get(4));
        Assert.assertEquals("Elephant", animals.get(5));
        Assert.assertEquals("Monkey", animals.get(6));
        Assert.assertEquals("Penguin", animals.get(7));
    }

    @Test
    public void checkSizeWithout_Third_Fifth_Seventh(){
        Assert.assertEquals(8, animals.size());
        zoo.removeSomeAnimals(animals);
        Assert.assertEquals(5, animals.size());

    }
}
