package org.teaching.lecture4_abstract_interfaces.additional_from_nadia.task3;

import org.junit.Assert;
import org.junit.Test;

/*
Интерфейс Printable
- Определить интерфейс Printable, содержащий метод void print().
- Определить класс Book, реализующий интерфейс Printable.
- Определить класс Magazine, реализующий интерфейс Printable.
- Создать массив типа Printable, который будет содержать книги и журналы.
- В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 */

public class PrintableTest {

    @Test
    public void printingPress_test(){
        Printable[] printing = {new Book(), new Magazine()};

        Assert.assertEquals("Print book.", printing[0].print());
        Assert.assertEquals("Print magazine.", printing[1].print());
    }
}
