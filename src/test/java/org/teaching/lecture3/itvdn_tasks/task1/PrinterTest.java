package org.teaching.lecture3.itvdn_tasks.task1;

/*
Создайте класс Printer.
В теле класса создайте метод void -->(String)<-- print(String value), который выводит на экран значение аргумента.
Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами.
Обязательно используйте приведение типов.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setUp(){
        printer = new Printer();
    }

    @Test
    public void shouldReturn_ArgumentValue(){
        String value = "Ukraine";

        Assert.assertEquals("Ukraine", printer.print(value));
    }
}
