package org.teaching.essential.lecture10_generics.additional_nadia.task2;

/*
Напишіть свій ітератор по одномірному масиву.
Ітератором буде клас який реалізує інтерфейс Iterator<T>.
В даному класі треба створити конструктор та реалізувати методи boolean hasNext() та Т next()
В методі next() необхідно зробити перевірку на наступний елемент, якщо такого немає викинути NoSuchElementException()

-- Створити вкладений клас, скидуати index.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyIterator<T> implements Iterator<T> {

    private static final Logger logger = LoggerFactory.getLogger(MyIterator.class);

    private final T[] elements;
    private int index;

    public MyIterator(T[] elements){
        this.elements = elements;
        index = 0;
    }

    public T[] getElements(){
        return elements;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public T next() {
        if (!hasNext()){
            logger.error("The next element doesn't exist!\n" +
                    "The array has just: {} elements, but you tried to call the: {}", elements.length, elements.length + 1);
            throw new NoSuchElementException("The next element doesn't exist!\n" +
                    "The array has just: " + elements.length + " elements" + "but you tried to call the: " + elements.length + 1);
        }
        return elements[index++];
    }
}
