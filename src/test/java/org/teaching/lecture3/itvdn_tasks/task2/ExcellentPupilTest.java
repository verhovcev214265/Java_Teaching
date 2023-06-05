package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcellentPupilTest {

    private ExcellentPupil excellentPupil;

    @Before
    public void setUp(){
        excellentPupil = new ExcellentPupil();
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Study", excellentPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Read", excellentPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Write", excellentPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Relax", excellentPupil.relax());
    }
}
