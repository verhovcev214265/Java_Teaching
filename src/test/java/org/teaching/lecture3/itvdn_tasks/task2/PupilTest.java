package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PupilTest {

    private Pupil pupil;

    @Before
    public void setUp(){
        pupil = new Pupil();
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Study", pupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Read", pupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Write", pupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Relax", pupil.relax());
    }
}
