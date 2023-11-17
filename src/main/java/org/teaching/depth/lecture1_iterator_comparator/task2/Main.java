package org.teaching.depth.lecture1_iterator_comparator.task2;

/*
Задание 2
Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Bob");
        students.add("Rob");
        students.add("Alex");
        students.add("Sem");
        students.add("Din");
        students.add("Kas");
        students.add("Mich");
        students.add("Jack");
        students.add("Jeniffer");
        students.add("Britney");

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

    }
}
