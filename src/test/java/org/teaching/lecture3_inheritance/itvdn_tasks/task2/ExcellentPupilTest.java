package org.teaching.lecture3_inheritance.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcellentPupilTest {

    private Pupil excellentPupil;

    @Before
    public void setUp(){
        excellentPupil = new ExcellentPupil();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(excellentPupil);
        Assert.assertTrue(excellentPupil instanceof Pupil);
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Excellent study", excellentPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Excellent read", excellentPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Excellent write", excellentPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Excellent relax", excellentPupil.relax());
    }
}
