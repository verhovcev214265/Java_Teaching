package org.teaching.lecture3.itvdn_tasks.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodPupilTest {

    private GoodPupil goodPupil;

    @Before
    public void setUp(){
        goodPupil = new GoodPupil();
    }

    @Test
    public void shouldReturn_defaultStudy(){
        Assert.assertEquals("Study", goodPupil.study());
    }

    @Test
    public void shouldReturn_defaultRead(){
        Assert.assertEquals("Read", goodPupil.read());
    }

    @Test
    public void shouldReturn_defaultWrite(){
        Assert.assertEquals("Write", goodPupil.write());
    }

    @Test
    public void shouldReturn_defaultRelax(){
        Assert.assertEquals("Relax", goodPupil.relax());
    }
}
