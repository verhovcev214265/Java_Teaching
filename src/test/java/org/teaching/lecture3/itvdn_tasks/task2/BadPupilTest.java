package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BadPupilTest {

    private BadPupil badPupil;

    @Before
    public void setUp(){
        badPupil = new BadPupil();
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Study", badPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Read", badPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Write", badPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Relax", badPupil.relax());
    }
}
