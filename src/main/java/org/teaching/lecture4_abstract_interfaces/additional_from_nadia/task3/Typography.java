package org.teaching.lecture4_abstract_interfaces.additional_from_nadia.task3;

/*
- Создать массив типа Printable, который будет содержать книги и журналы.
- В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 */

public class Typography {

    public String printingPress(Printable[] elementsForPrinting){

        String[] printed = new String[elementsForPrinting.length];

        for (int i = 0; i < elementsForPrinting.length; i++) {
             printed[i] = elementsForPrinting[i].print();
        }

        return String.join(", ", printed);
    }
}
