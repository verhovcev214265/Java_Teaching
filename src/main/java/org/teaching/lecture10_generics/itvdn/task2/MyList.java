package org.teaching.lecture10_generics.itvdn.task2;

/*
Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества
элементов.
 */

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unchecked")
public class MyList<T> {
    private static final Logger logger = LoggerFactory.getLogger(MyList.class);
    private static final int INITIAL_CAPACITY = 4;
    private T[] elements;
    private int size;

    public MyList() {
        elements = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size] = element;
        size++;
    }

    public T getElement(int index) {
        if (index < 0 || index >= size) {
            logger.error("This array has just: {} indexes.\n" +
                    " but you had tried to call a: {}", elements.length - 1, index);
            throw new IndexOutOfBoundsException("This array has just: " + (elements.length - 1) + "indexes.\n" +
                    " but you had tried to call a: " + index);
        }

        T item = (T) elements[index];
        return item;
    }

    public int getSize(){
        return size;
    }
}
