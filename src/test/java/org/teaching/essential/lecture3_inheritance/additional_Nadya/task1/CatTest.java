package org.teaching.essential.lecture3_inheritance.additional_Nadya.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    private Pet cat;

    @Before
    public void setUp(){
        cat = new Cat("Naphanya", "The best of the cats");
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Naphanya", cat.getName());
        Assert.assertEquals("The best of the cats", cat.type());
    }

    @Test
    public void shouldReturn_CatSound(){
        Assert.assertEquals("Meow - meow", cat.sound());
    }

    @Test
    public void shouldReturn_CatName(){
        Assert.assertEquals("Naphanya", cat.show());
    }

    @Test
    public void shouldReturn_CatType(){
        Assert.assertEquals("The best of the cats", cat.type());
    }
}
