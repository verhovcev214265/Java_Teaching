package org.teaching.essential.lecture7_anonymous_enums.additional_nadia;

/*
Интерфейс Printable
- Определить интерфейс Printable, содержащий метод void print().
- Определить класс Book, реализующий интерфейс Printable.
- Определить класс Magazine, реализующий интерфейс Printable.
- Создать анонимный класс расширяющий интерфейс Printable, в методе print() которого будут печататься газеты.
- Создать массив типа Printable, который будет содержать книги, журналы и обьект анонимного класса.
- В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 */

public interface Printable {
    String print();
}
