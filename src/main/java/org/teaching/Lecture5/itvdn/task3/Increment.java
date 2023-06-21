package org.teaching.Lecture5.itvdn.task3;

/*
Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
значения на 1;
 */

import java.util.List;
import java.util.ListIterator;

public class Increment {

    public List<Integer> incremented(List<Integer> numbers){

        ListIterator<Integer> listIterator = numbers.listIterator();

        for (int i = 0; listIterator.hasNext(); i++) {
            numbers.set(i, listIterator.next() + 1);
        }

        return numbers;
    }
}
