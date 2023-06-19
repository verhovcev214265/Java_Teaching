package org.teaching.lecture4.additional_from_nadia.task3;

// - Определить класс Book, реализующий интерфейс Printable.

public class Book implements Printable{

    @Override
    public String print() {
        return "Print book.";
    }
}
