package org.teaching.essential.lecture1_classes_p1.task3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book();
    }

    @Test
    public void checkNotNull(){
        Assert.assertNotNull(book);
    }

    @Test
    public void shouldReturnBookMame(){
        String bookName = "Philosophy Java";
        book.setName(bookName);

        book.show();
    }
}
