package org.teaching.essential.lecture3_inheritance.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodPupilTest {

    private Pupil goodPupil;

    @Before
    public void setUp(){
        goodPupil = new GoodPupil();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(goodPupil);
        Assert.assertTrue(goodPupil instanceof Pupil);
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Good study", goodPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Good read", goodPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Good write", goodPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Good relax", goodPupil.relax());
    }
}
