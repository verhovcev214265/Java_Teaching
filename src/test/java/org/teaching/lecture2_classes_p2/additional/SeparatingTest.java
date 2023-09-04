package org.teaching.lecture2_classes_p2.additional;

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
        Assert.assertEquals("A-Bb-Ccc-Dddd", separating.splitting("abcd"));
        Assert.assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", separating.splitting("RqaEzty"));
        Assert.assertEquals("C-Ww-Aaa-Tttt", separating.splitting("cwAt"));
    }
}
