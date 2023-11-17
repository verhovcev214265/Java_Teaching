package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task3;

// - Определить класс Book, реализующий интерфейс Printable.

public class Book implements Printable{

    @Override
    public String print() {
        return "Print book.";
    }
}
