package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task3;

// - Определить класс Magazine, реализующий интерфейс Printable.

public class Magazine implements Printable{

    @Override
    public String print() {
        return "Print magazine.";
    }
}
