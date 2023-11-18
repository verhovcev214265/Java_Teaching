package org.teaching.depth.lecture1_iterator_comparator.additional;

/*
Создайте класс Product с полями: Имя продукта, цена, количество. Создайте 2
отдельных класса, реализующих интерфейс Comparator, а именно метод
compare() для сортировки объектов по названию и по цене.
 */

public class Product {
    private final String name;
    private final int price;
    private final int numbers;

    public Product(String name, int price, int numbers) {
        this.name = name;
        this.price = price;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumbers() {
        return numbers;
    }

    @Override
    public String toString(){
        return "Product: name - " + this.name + ", price = " + this.price + ", numbers = " + this.numbers + ".";
    }
}
