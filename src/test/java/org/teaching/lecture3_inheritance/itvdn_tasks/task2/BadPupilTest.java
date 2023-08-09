package org.teaching.lecture3_inheritance.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BadPupilTest {

    private Pupil badPupil;

    @Before
    public void setUp(){
        badPupil = new BadPupil();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(badPupil);
        Assert.assertTrue(badPupil instanceof Pupil);
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Bad study", badPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Bad read", badPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Bad write", badPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Bad relax", badPupil.relax());
    }
}
