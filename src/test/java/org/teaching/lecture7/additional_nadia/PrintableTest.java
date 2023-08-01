package org.teaching.lecture7.additional_nadia;

import org.junit.Assert;
import org.junit.Test;

public class PrintableTest {

    @Test
    public void print_test(){

        Book book = new Book();
        Magazine magazine = new Magazine();

        Printable printable = new Printable() {
            @Override
            public String print() {
                return "Newspaper has printed";
            }
        };

        Printable[] forPrinting = {book, magazine, printable};

        Assert.assertEquals("Book has printed", forPrinting[0].print());
        Assert.assertEquals("Magazine has printed", forPrinting[1].print());
        Assert.assertEquals("Newspaper has printed", forPrinting[2].print());
    }

}
