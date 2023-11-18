package org.teaching.essential.lecture3_inheritance.additional_Nadya.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    private Pet dog;

    @Before
    public void setUp(){
        dog = new Dog("Rex", "Germany Shepherd");
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Rex", dog.getName());
        Assert.assertEquals("Germany Shepherd", dog.getType());
    }

    @Test
    public void shouldReturn_DogSound(){
        Assert.assertEquals("Gav - gav", dog.sound());
    }

    @Test
    public void shouldReturn_CatName(){
        Assert.assertEquals("Rex", dog.show());
    }

    @Test
    public void shouldReturn_CatType(){
        Assert.assertEquals("Germany Shepherd", dog.type());
    }
}
