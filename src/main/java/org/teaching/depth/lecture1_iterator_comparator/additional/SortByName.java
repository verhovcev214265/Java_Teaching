package org.teaching.depth.lecture1_iterator_comparator.additional;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {

    @Override
    public int compare(Product productA, Product productB){
        return productA.getName().compareTo(productB.getName());
    }
}
