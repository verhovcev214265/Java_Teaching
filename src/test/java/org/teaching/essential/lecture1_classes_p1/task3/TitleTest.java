package org.teaching.essential.lecture1_classes_p1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TitleTest {

    private Title title;

    @Before
    public void setUp(){
        title = new Title();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(title);
    }

    @Test
    public void shouldReturnTitleDescription(){
        String description  = "Write Once, Run Anywhere";
        title.setDescription(description);

        title.show();
    }
}
