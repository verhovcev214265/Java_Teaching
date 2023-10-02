package org.teaching.lecture10_generics.additional_nadia.task1;

/*
Створіть клас Generic - клас. В класі має бути метод show(), який буде виводити у консоль тип, переданий у сам клас
Приклад: MyClass<Integer> instance = new MyClass<>();
вивід: class java.lang.Integer
 */

public class Generic<T> {

    private final T element;

    public Generic(T element) {
        this.element = element;
    }

    public Class<?> show() {
        return element.getClass();
    }
}
