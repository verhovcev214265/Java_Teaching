package org.teaching.depth.lecture1_iterator_comparator.additional;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product productA, Product productB){
        return productA.getPrice() - productB.getPrice();
    }
}
