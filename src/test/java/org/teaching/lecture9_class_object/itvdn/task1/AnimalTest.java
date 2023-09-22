package org.teaching.lecture9_class_object.itvdn.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

    private Animal animalA;

    @Before
    public void setUp(){
        animalA = new Animal("Bob", 10, true);
    }

    @Test
    public void checkSameAnimals(){
        Animal animalB = new Animal("Bob", 10, true);
        Assert.assertEquals(animalA, animalB);
    }

    @Test
    public void checkDifferentAnimals(){
        Animal animalC = new Animal("Rob", 12, false);
        Assert.assertNotEquals(animalA, animalC);
    }
}
