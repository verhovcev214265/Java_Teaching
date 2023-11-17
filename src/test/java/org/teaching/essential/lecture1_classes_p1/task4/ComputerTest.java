package org.teaching.essential.lecture1_classes_p1.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputerTest {

    private Computer[] computers;

    @Before
    public void setUp() {
        computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }
    }

    @Test
    public void checkNotNull() {
        Assert.assertNotNull(computers);
        Assert.assertEquals(5, computers.length);

        for (Computer computer : computers){
            Assert.assertNotNull(computer);
        }
    }


    @Test
    public void shouldReturnCorrectModel(){
        String[] models = {"Dell", "Samsung", "Apple", "Acer", "Asus"};

        for (int i = 0; i < computers.length; i++) {
            computers[i].setName(models[i]);
        }

        for (int i = 0; i < computers.length; i++) {
            Assert.assertEquals(models[i], computers[i].getName());
        }
    }
}