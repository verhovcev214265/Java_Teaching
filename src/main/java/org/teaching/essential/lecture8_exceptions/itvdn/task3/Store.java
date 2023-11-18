package org.teaching.essential.lecture8_exceptions.itvdn.task3;

/*
Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.
 */

public class Store implements Comparable<Store>{

    private final String productName;
    private final String name;
    private final int price;

    public Store(String productName, String store, int price) {
        this.productName = productName;
        this.name = store;
        this.price = price;
    }

    @Override
    public int compareTo(Store other){
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString(){
        return "Price - " +
                "product name: " + productName +
                ", store name: " + name +
                ", price = " + price + ".";
    }

}
