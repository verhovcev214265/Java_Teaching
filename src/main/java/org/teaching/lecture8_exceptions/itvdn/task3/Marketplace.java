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

import java.util.Scanner;

public class Marketplace {

    private static final Logger LOGGER = LoggerFactory.getLogger(Marketplace.class);

    private final Price[] prices;
    private int numbersOfPrices;
    private Scanner scan;

    public Marketplace(int numbersOfPrices) {
        if (numbersOfPrices > 2) {
            LOGGER.error("The number of the stores shouldn't be more than 2 - shops. But you've entered: {}", numbersOfPrices);
            throw new IllegalArgumentException("The number of the stores shouldn't be more than 2 - shops. But you've entered: " + numbersOfPrices);
        }

        prices = new Price[numbersOfPrices];
    }

    public void setPrice(Price stores) {
        numbersOfPrices++;

        if (numbersOfPrices > prices.length) {
            LOGGER.error("You can't add another store because the array are full!");
            return;
        }

        LOGGER.info("Enter the product name:");
        String prodName = scan.next();

        LOGGER.info("Enter the name of the store:");
        String storeName = scan.next();

        LOGGER.info("Enter price:");
        int price = scan.nextInt();

        this.prices[numbersOfPrices - 1] = new Price(prodName, storeName, price);
    }

    public String showGoods() {

        LOGGER.info("Enter store name:");
        String storeName = scan.next();

        for (Price price : prices) {
            if (price.getStoreName().equals(storeName)) return price.getProductName();
        }
        LOGGER.error("Sorry but we haven't {} store in our marketplace!", storeName);
        throw new IllegalArgumentException("Sorry but we haven't " + storeName + " store in our marketplace!");
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public Price[] getPrices() {
        return prices;
    }

}
