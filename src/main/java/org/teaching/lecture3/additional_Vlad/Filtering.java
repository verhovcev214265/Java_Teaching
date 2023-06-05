package org.teaching.lecture3.additional_Vlad;

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns
a new list with the strings filtered out.

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
 */

import java.util.ArrayList;
import java.util.List;

public class Filtering {

    public List<Integer> stringsFilteredOut(List<Object> nonFiltered){

        List<Integer> filtered = new ArrayList<>();

        for (Object element : nonFiltered){
            if (element instanceof Integer){
                filtered.add((Integer) element);
            }
        }
        return filtered;
    }
}
