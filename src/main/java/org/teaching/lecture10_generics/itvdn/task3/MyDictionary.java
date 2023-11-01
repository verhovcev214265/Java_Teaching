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
    private Pair<Key, Value>[] pairs;
    private int size;

    public static class Pair<Key, Value> {
        private final Key key;
        private final Value value;

        public Pair(Key key, Value value){
            this.key = key;
            this.value = value;
        }

        public Key getKey(){
            return key;
        }

        public Value getValue(){
            return value;
        }

        @Override
        public String toString() {
            return "Pair: " + "key = " + key + ", value = " + value + ".";
        }
    }

    public MyDictionary(){
        pairs = new Pair[INITIAL_CAPACITY];
        size = 0;
    }

    public void addElement(Key key, Value value){
        if (size == pairs.length){
            pairs = Arrays.copyOf(pairs, size * 2);
        }
        pairs[size] = new Pair<>(key, value);
        size++;
    }

    public Pair<Key, Value> getElement(int index){
        if (index < 0 || index >= size){
            logger.error("This array has just: {} indexes.\n" +
                    "but you you had tried call a: {}", pairs.length - 1, index);
            throw new IndexOutOfBoundsException("This array has just: " + (pairs.length - 1) + "indexes." +
                    " but you had tried call a: " + index);
        }

        return pairs[index];
    }

    public int getSize(){
        return size;
    }
}
