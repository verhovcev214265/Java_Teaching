package org.teaching.lecture1.task4;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComputerTest {

    private static Computer[] computers;

    @BeforeClass
    public static void setUp() {
        computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }
    }

    @Test
    public void checkNull() {
        for (Computer tmp : computers){
            Assert.assertNotNull(tmp);
        }
    }

    @Test
    public void shouldReturnCorrectSize(){
        int expected = 5;
        int actual = computers.length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectModel(){
        String[] models = {"Dell", "Samsung", "Apple", "Acer", "Asus"};

        for (int i = 0; i < computers.length; i++) {
            computers[i].setModel(models[i]);
        }

        for (int i = 0; i < computers.length; i++) {
            Assert.assertEquals(models[i], computers[i].getModel());
        }
    }
}