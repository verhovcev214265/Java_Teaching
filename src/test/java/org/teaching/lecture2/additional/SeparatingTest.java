package org.teaching.lecture2.additional;

/*
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeparatingTest {

    private Separating separating;

    @Before
    public void setUp(){
        separating = new Separating();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(separating);
    }

    @Test
    public void checkIsLetter(){
        Assert.assertTrue("All elements are letters", separating.checkNotLetters("abcd"));
        Assert.assertTrue("All elements are letters", separating.checkNotLetters("RqaEzty"));
        Assert.assertTrue("All elements are letters", separating.checkNotLetters("cwAt"));
    }

    @Test
    public void checkIsNotLetter(){
        Assert.assertFalse("Not all elements are letters", separating.checkNotLetters("abc1d"));
        Assert.assertFalse("Not all elements are letters", separating.checkNotLetters("Rq2aEzt9y"));
        Assert.assertFalse("Not all elements are letters", separating.checkNotLetters("c4wA123t"));
    }

    @Test
    public void shouldReturn_splitElements(){
        String inputA = "abcd";
        String inputB = "RqaEzty";
        String inputC = "cwAt";

        String expectedA = "A-Bb-Ccc-Dddd";
        String expectedB = "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy";
        String expectedC = "C-Ww-Aaa-Tttt";

        Assert.assertEquals(expectedA, separating.splitting(inputA));
        Assert.assertEquals(expectedB, separating.splitting(inputB));
        Assert.assertEquals(expectedC, separating.splitting(inputC));
    }
}
