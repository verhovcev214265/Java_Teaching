package org.teaching.lecture10_generics.itvdn.task3;

/*
Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.
 */
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("uncheked")
public class MyDictionary<Key, Value> {
    private static final Logger logger = LoggerFactory.getLogger(MyDictionary.class);
    private static final int INITIAL_CAPACITY = 4;
    private final int lastElement = 0;
    private Key[] keys;
    private Value[] values;
    private int size;

    public MyDictionary(int length){
        keys = (Key[]) new Object[INITIAL_CAPACITY];
        values = (Value[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void addKey(Key element){
        if (size == keys.length){
            keys = Arrays.copyOf(keys, size * 2);
        }
        keys[size] = element;
        size++;
    }

    public void addValue(Value element){
        if (size == values.length){
            values = Arrays.copyOf(values, size * 2);
        }
        values[size] = element;
        size++;
    }

    public Key getIndexKey(int index){
        if (index < 0 || index >= size){
            logger.error("This array has just: {} indexes.\n" +
                    "but you you had tried call a: {}", keys.length - 1, index);
            throw new IndexOutOfBoundsException("This array has just: " + (keys.length - 1) + "indexes.\n" +
                    " but yiu had tried call a: " + index);
        }

        Key item = (Key) keys[index];
        return item;
    }


}
