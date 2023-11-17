package org.teaching.essential.lecture7_anonymous_enums.itvdn.task2;

import org.junit.Assert;
import org.junit.Test;

public class AnimalsTest {

    private Animals animal;

    @Test
    public void dog_test(){
        animal = Animals.DOG;

        Assert.assertEquals("Animal: DOG, age = 7", animal.toString());
    }

    @Test
    public void tiger_test(){
        animal = Animals.TIGER;

        Assert.assertEquals("Animal: TIGER, age = 9", animal.toString());
    }

}
