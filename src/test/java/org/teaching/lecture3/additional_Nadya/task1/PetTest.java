package org.teaching.lecture3.additional_Nadya.task1;

/*
Создать базовый класс «Домашнее животное» и производные классы «Собака», «Кошка»
С помощью конструктора установить имя каждого животного и его характеристики.
Реализуйте для каждого из классов функции:
Sound – издает звук животного (пишем текстом в консоль);
Show – отображает имя животного;
Type – отображает название его подвида
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest {

    private Pet pet;

    @Before
    public void setUp(){
        pet = new Pet("Dog", "Labrador");
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Dog", pet.getName());
        Assert.assertEquals("Labrador", pet.getType());
    }

    @Test
    public void shouldReturn_DefaultPetSound(){
        Assert.assertEquals("I can speak", pet.sound());
    }

    @Test
    public void shouldReturn_DefaultName(){
        Assert.assertEquals("Dog", pet.show());
    }

    @Test
    public void shouldReturn_DefaultType(){
        Assert.assertEquals("Labrador", pet.type());
    }
}
