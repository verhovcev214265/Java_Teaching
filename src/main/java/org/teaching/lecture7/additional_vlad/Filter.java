package org.teaching.lecture7.additional_vlad;

/*
In this kata you will create a function that takes a list of non-negative integers and strings and
returns a new list with the strings filtered out.
 */

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Filter {

    private static final Logger logger = LoggerFactory.getLogger(Filter.class);

    public List<Integer> filteredOutA(List<?> nonFiltered) {

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

    public List<Integer> filteredOutB(List<Object> nonFiltered) {

        List<Integer> filtered = new ArrayList<>();

        for (Object element : nonFiltered) {
            try {
                int value = (Integer) element;
                filtered.add(value);
            } catch (ClassCastException e) {
                try {
                    String value = (String) element;
                    filtered.add(Integer.parseInt(value));
                } catch (NumberFormatException ex) {
//                    logger.info("This string can't be transformed to number."); // Very much time for logger operation
                }
            }
        }
        return filtered;
    }

}
