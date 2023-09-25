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

public class MyList<T> {
    private static final Logger logger = LoggerFactory.getLogger(MyList.class);
    private Object[] elements;
    private int size;

    public MyList(int length) {
        elements = new Object[length];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (size * 3) / 2);
        }
        elements[size] = element;
        size++;
    }

    public T getIndex(int index) {
        if (index < 0 || index >= size) {
            logger.error("This array has just: {} indexes.\n" +
                    " but you had tried to call a: {}", elements.length - 1, index);
            throw new IndexOutOfBoundsException("This array has just: " + (elements.length - 1) + "indexes.\n" +
                    " but you had tried to call a: " + index);
        }
        @SuppressWarnings("unchecked")
        T item = (T) elements[index];
        return item;
    }

    public int getSize(){
        return size;
    }

    public Object[] getElements(){
        return elements;
    }

}
