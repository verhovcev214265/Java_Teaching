package org.teaching.lecture4.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Recording player;

    @Before
    public void setUp(){
        player = new Player();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(player);
        Assert.assertTrue(player instanceof Recording);
    }

    @Test
    public void shouldRunOption_Play(){
        Assert.assertEquals("Play.", player.play());
    }

    @Test
    public void shouldRunOption_Pause(){
        Assert.assertEquals("Pause.", player.pause());
    }

    @Test
    public void shouldRunOption_Stop(){
        Assert.assertEquals("Stop.", player.stop());
    }

    @Test
    public void shouldRunOption_Record(){
        Assert.assertEquals("Record.", player.record());
    }
}
