package org.teaching.lecture1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {

    private static Book book;

    @BeforeClass
    public static void setUp(){
        book = new Book();
    }

    @Before
    public void checkNull(){
        Assert.assertNotNull(book);
    }

    @Test
    public void shouldReturnBookMame(){
        String bookName = "Philosophy Java";
        book.setName(bookName);

        Assert.assertEquals(bookName, book.show());
    }
}
