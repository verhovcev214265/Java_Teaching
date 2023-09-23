package org.teaching.lecture10_generics.additional_nadia.task1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Створіть клас Generic - клас. В класі має бути метод show(), який буде виводити у консоль тип, переданий у сам клас
Приклад: MyClass<Integer> instance = new MyClass<>();
вивід: class java.lang.Integer
 */

public class Generic<T> {

    private static final Logger logger = LoggerFactory.getLogger(Generic.class);

    private final T element;

    public Generic(T element) {
        this.element = element;
    }

    public Object show() {
        return element.getClass();
    }
}
