package org.teaching.depth.lecture1_iterator_comparator.task1;

/*
Задание
В папке с примерами, ex_004_comparable.
Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов
равна, то ищем по цене) -> цене - > моделе(breed) -> цвету машины(weight)  =)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Shepherd", 60, 55, 1000));
        animals.add(new Animal("Shepherd", 61, 55, 1000));
        animals.add(new Animal("Malinois", 35, 85, 4000));
        animals.add(new Animal("Pit bull", 72, 55, 1200));
        animals.add(new Animal("Stafford", 55, 55, 1000));

        Collections.sort(animals);
        for(Animal animal : animals) System.out.println(animal);
    }
}

