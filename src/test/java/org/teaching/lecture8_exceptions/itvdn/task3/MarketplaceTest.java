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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertThrows;

public class MarketplaceTest {

    private Marketplace marketplace;
    private List<String> expected;
    private Scanner mockScan;


    @Before
    public void setUp() {
        marketplace = new Marketplace();

        mockScan = Mockito.mock(Scanner.class);
        marketplace.setScan(mockScan);

        expected = new ArrayList<>();

        when(mockScan.next()).thenReturn("Smartphones").thenReturn("Samsung");
        when(mockScan.nextInt()).thenReturn(10_000);
        marketplace.addPrice(new Store("Smartphones", "Samsung", 10_000));

        when(mockScan.next()).thenReturn("IPhones").thenReturn("Apple");
        when(mockScan.nextInt()).thenReturn(12_000);
        marketplace.addPrice(new Store("IPhones", "Apple", 12_000));
    }

    @Test
    public void setMarketplace_test() {
        expected = Arrays.asList(
                "Price - product name: IPhones, store name: Apple, price = 12000.",
                "Price - product name: Smartphones, store name: Samsung, price = 10000."
        );

        for (int i = 0; i < marketplace.getPrices().length; i++) {
            Assert.assertEquals(expected.get(i), marketplace.getPrices()[i].toString());
        }
    }

    @Test
    public void sortCheck(){
        Arrays.sort(marketplace.getPrices());

        expected = Arrays.asList(
                "Price - product name: IPhones, store name: Apple, price = 12000.",
                "Price - product name: Smartphones, store name: Samsung, price = 10000."
        );

        for (int i = 0; i < marketplace.getPrices().length; i++) {
            Assert.assertEquals(expected.get(i), marketplace.getPrices()[i].toString());
        }
    }

    @Test
    public void testShowGoods_By_IllegalArgument(){
        when(mockScan.next()).thenReturn("LIDL");
        Store price = marketplace.showPriceByStoreName();
        assertNull(price);
    }

    @Test
    public void showGoods_testA() {
        when(mockScan.next()).thenReturn("Samsung");
        Assert.assertEquals("Smartphones", marketplace.showPriceByStoreName().getProductName());
    }

    @Test
    public void showGoods_testB() {
        when(mockScan.next()).thenReturn("Apple");
        Assert.assertEquals("IPhones", marketplace.showPriceByStoreName().getProductName());
    }
}
