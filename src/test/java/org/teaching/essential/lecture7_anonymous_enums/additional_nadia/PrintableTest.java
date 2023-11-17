package org.teaching.essential.lecture7_anonymous_enums.additional_nadia;

import org.junit.Assert;
import org.junit.Test;

public class PrintableTest {

    @Test
    public void print_test(){

        Printable book = new Book();
        Printable magazine = new Magazine();

        Printable printable = new Printable() {
            @Override
            public String print() {
                return "Newspaper has printed";
            }
        };

        Printable[] prints = {book, magazine, printable};

        Assert.assertEquals("Book has printed", prints[0].print());
        Assert.assertEquals("Magazine has printed", prints[1].print());
        Assert.assertEquals("Newspaper has printed", prints[2].print());
    }

}
