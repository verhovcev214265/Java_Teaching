package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContentTest {

    private Content content;

    @Before
    public void setUp(){
        content = new Content();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(content);
    }

    @Test
    public void shouldReturnContentName(){
        String contentDescription = "Learning Java";
        content.setDescription(contentDescription);

        content.show();
    }
}
