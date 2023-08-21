package org.teaching.lecture8_exceptions.itvdn.task3;

/*
Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.
 */

public class Price implements Comparable<Price>{

    private final String productName;
    private final String storeName;
    private final int price;

    public Price(String productName, String store, int price) {
        this.productName = productName;
        this.storeName = store;
        this.price = price;
    }

    @Override
    public int compareTo(Price other){
        return this.storeName.compareTo(other.storeName);
    }

    public String getStoreName() {
        return storeName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString(){
        return "Price - " +
                "product name: " + productName +
                ", store name: " + storeName +
                ", price = " + price + ".";
    }

}
