package org.teaching.lecture4.additional_from_nadia.task1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WorkerTest {
    private Employer worker;

    @Before
    public void setUp(){
        worker = new Worker();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(worker);
        Assert.assertTrue(worker instanceof Employer);
    }

    @Test
    public void shouldReturnProfession(){
        String expected = "I'm worker.";

        Assert.assertEquals(expected, worker.print());
    }
}
