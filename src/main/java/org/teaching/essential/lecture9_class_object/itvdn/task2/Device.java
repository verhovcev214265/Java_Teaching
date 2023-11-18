package org.teaching.essential.lecture9_class_object.itvdn.task2;

/*
1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
Добавить методы доступа. Конструктор.
---------------------------------------------------------------------------------------------------------
В обоих классах переопределить метод toString, что бы вывод был следующим:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
---------------------------------------------------------------------------------------------------------
Переопределить методы equals & hashCode в каждом классе.
Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
методы.
 */

import java.util.Objects;

public class Device {

    private final String manufacturer;
    private final float price;
    private final String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + manufacturer + ", " +
                "price = " + price + ", " +
                "serial number = " + serialNumber + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Device)) return false;
        Device device = (Device) other;
        return Objects.equals(manufacturer, device.manufacturer)
                && price == device.price
                && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
