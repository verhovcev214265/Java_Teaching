package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthorTest {

    private static Author author;

    @BeforeClass
    public static void setUp(){
        author = new Author();
    }

    @Before
    public void checkNull(){
        Assert.assertNotNull(author);
    }

    @Test
    public void shouldReturnAuthorName(){
        String authorName = "Bruce Eckel";
        author.setName(authorName);

        Assert.assertEquals(authorName, author.show());

    }
}
