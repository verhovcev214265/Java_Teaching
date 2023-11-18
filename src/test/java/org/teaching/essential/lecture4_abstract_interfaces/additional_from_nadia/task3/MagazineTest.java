package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MagazineTest {

    private Printable magazine;

    @Before
    public void setUp(){
        magazine = new Magazine();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(magazine);
        Assert.assertTrue(magazine instanceof Printable);
    }

    @Test
    public void shouldPrint_Magazine(){
        Assert.assertEquals("Print magazine.", magazine.print());
    }
}
