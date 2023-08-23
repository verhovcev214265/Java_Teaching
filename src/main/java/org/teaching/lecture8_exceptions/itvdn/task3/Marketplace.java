package org.teaching.lecture8_exceptions.itvdn.task3;

/*
Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
быть упорядочены в алфавитном порядке по названиям магазинов);
 вывод на экран информации о товарах, продающихся в магазине, название которого введено с
клавиатуры (если такого магазина нет, вывести исключение).
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Marketplace {
    private static final Logger logger = LoggerFactory.getLogger(Marketplace.class);

    private final Store[] prices;
    private Map<String, Store> pricesMap; // Key - storeName, Value - Price
    private int numbersOfPrices = 2;
    private Scanner scan;

    public Marketplace() {
        prices = new Store[numbersOfPrices];
        pricesMap = new HashMap<>();
    }

    public void addPrice(Store price) {
        pricesMap.put(price.getName(), price);
    }

    public Store showPriceByStoreName() {
        logger.info("Enter store name:");
        String storeName = scan.next();
        return pricesMap.get(storeName);
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public Store[] getPrices() {
        return pricesMap.values().toArray(new Store[pricesMap.size()]);
    }
}
