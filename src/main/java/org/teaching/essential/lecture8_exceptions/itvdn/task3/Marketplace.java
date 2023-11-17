package org.teaching.essential.lecture8_exceptions.itvdn.task3;

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

    private final Store[] stores;
    private Map<String, Store> storeMap; // Key - storeName, Value - Price
    private int numbersOfStores = 2;
    private Scanner scan;

    public Marketplace() {
        stores = new Store[numbersOfStores];
        storeMap = new HashMap<>();
    }

    public void addStore(Store price) {
        storeMap.put(price.getName(), price);
    }

    public Store showStoreByStoreName() {
        logger.info("Enter store name:");
        String storeName = scan.next();
        return storeMap.get(storeName);
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public Store[] getStores() {
        return storeMap.values().toArray(new Store[storeMap.size()]);
    }
}
