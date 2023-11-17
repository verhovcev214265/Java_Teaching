package org.teaching.depth.lecture1_iterator_comparator.additional;

/*
Затем создайте несколько
коллекций продуктов (массив и ArrayList) и вызовите метод Arrays.sort() или Collections.sort() соответственно,
который выполняет сортировку и принимает в качестве параметров массив/список продуктов и объект
класса реализующий интерфейс Comparator. Выведите список продуктов (ArrayList) через итератор
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Smartphone", 5000, 100));
        listOfProducts.add(new Product("Laptop", 6000, 200));
        listOfProducts.add(new Product("Headphones", 2500, 1000));

        listOfProducts.sort(new SortByName());

        Iterator<Product> iteratorByName = listOfProducts.iterator();
        while (iteratorByName.hasNext()){
            System.out.println(iteratorByName.next());
        }

        Collections.sort(listOfProducts, new SortByPrice());
        System.out.println();

        Iterator<Product> iteratorByPrice = listOfProducts.listIterator();
        while (iteratorByPrice.hasNext()){
            System.out.println(iteratorByPrice.next());
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        Product[] arrayOfProducts = new Product[]{
                new Product("Smartphone", 5000, 100),
                new Product("Laptop", 6000, 200),
                new Product("Headphones", 2500, 1000)
        };

        Arrays.sort(arrayOfProducts, new SortByName());
        for(Product product : arrayOfProducts) System.out.println(product);

        System.out.println();

        Arrays.sort(arrayOfProducts, new SortByPrice());
        for (Product product : arrayOfProducts) System.out.println(product);


    }
}
