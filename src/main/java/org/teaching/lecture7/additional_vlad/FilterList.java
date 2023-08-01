package org.teaching.lecture7.additional_vlad;

/*
In this kata you will create a function that takes a list of non-negative integers and strings and
returns a new list with the strings filtered out.
 */

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

    public List<String> filteredOut(List<?> list){

        return list.stream()
                .filter(element -> element instanceof String)
                .map(Object :: toString)
                .collect(Collectors.toList());
    }
}
