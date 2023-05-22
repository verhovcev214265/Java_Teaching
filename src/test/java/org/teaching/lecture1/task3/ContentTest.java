package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContentTest {

    private static Content content;

    @BeforeClass
    public static void setUp(){
        content = new Content();
    }

    @Before
    public void checkNull(){
        Assert.assertNotNull(content);
    }

    @Test
    public void shouldReturnContentName(){
        String contentDescription = "Learning Java";
        content.setDescription(contentDescription);

        Assert.assertEquals(contentDescription, content.show());
    }
}
