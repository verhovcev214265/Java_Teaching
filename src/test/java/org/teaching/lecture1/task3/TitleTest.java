package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TitleTest {

    private static Title title;

    @BeforeClass
    public static void setUp(){
        title = new Title();
    }

    @Before
    public void checkNull(){
        Assert.assertNotNull(title);
    }

    @Test
    public void shouldReturnTitleDescription(){
        String description  = "Write Once, Run Anywhere";
        title.setDescription(description);

        Assert.assertEquals(description, title.show());
    }
}
