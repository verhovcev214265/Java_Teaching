package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task3;

/*
Интерфейс Printable
- Определить интерфейс Printable, содержащий метод void print().
- Определить класс Book, реализующий интерфейс Printable.
- Определить класс Magazine, реализующий интерфейс Printable.
- Создать массив типа Printable, который будет содержать книги и журналы.
- В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Printable book = new Book();

    @Before
    public void setUp(){
        book = new Book();
    }

    @Test
    public void checkInheritance(){
        Assert.assertNotNull(book);
        Assert.assertTrue(book instanceof Printable);
    }

    @Test
    public void shouldPrint_Book(){
        Assert.assertEquals("Print book.", book.print());
    }
}
