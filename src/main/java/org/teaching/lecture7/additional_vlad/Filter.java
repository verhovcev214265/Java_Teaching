package org.teaching.lecture7.additional_vlad;

/*
In this kata you will create a function that takes a list of non-negative integers and strings and
returns a new list with the strings filtered out.
 */

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public List<Integer> filteredOut(List<?> nonFiltered) {

        List<Integer> filtered = new ArrayList<>();

        for (Object element : nonFiltered) {
            if (element instanceof String) {
                String string = (String) element;
                if (string.matches("\\d+")) {
                    filtered.add(Integer.parseInt(string));
                }
            } else if (element instanceof Integer) {
                filtered.add((Integer) element);
            }

        }
        return filtered;
    }

}
