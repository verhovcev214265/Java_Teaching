package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthorTest {

    private Author author;

    @Before
    public void setUp(){
        author = new Author();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(author);
    }

    @Test
    public void shouldReturnAuthorName(){
        String authorName = "Bruce Eckel";
        author.setName(authorName);

        author.show();
    }
}
