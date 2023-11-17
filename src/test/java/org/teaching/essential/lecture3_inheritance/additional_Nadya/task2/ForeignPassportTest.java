package org.teaching.essential.lecture3_inheritance.additional_Nadya.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ForeignPassportTest {

    private ForeignPassport foreignPassport;

    @Before
    public void setUp(){
        foreignPassport = new ForeignPassport("Petro", "Poroshenko", 26, 9,
                1965,false, 123456
        );
    }

    @Test
    public void checkConstructor(){
        Assert.assertEquals("Petro", foreignPassport.getName());
        Assert.assertEquals("Poroshenko", foreignPassport.getSureName());
        Assert.assertEquals(26, foreignPassport.getDay());
        Assert.assertEquals(9, foreignPassport.getMonth());
        Assert.assertEquals(1965, foreignPassport.getYear());
        Assert.assertFalse(foreignPassport.isSchengenVisa());
        Assert.assertEquals(123456, foreignPassport.getNumber());
    }
}
