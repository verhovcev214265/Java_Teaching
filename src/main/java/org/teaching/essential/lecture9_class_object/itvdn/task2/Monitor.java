package org.teaching.essential.lecture9_class_object.itvdn.task2;

import java.util.Objects;

public class Monitor extends Device {

    private final int resolutionX;
    private final int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer = " + getManufacturer() + ", " +
                "price = " + getPrice() + ", " +
                "serial number = " + getSerialNumber() + ", " +
                "resolutionX = " + resolutionX + ", " +
                "resolutionY = " + resolutionY + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Monitor)) return false;
        Monitor monitor = (Monitor) other;
        return Objects.equals(getManufacturer(), monitor.getManufacturer()) &&
                getPrice() == monitor.getPrice() &&
                Objects.equals(getSerialNumber(), monitor.getSerialNumber()) &&
                resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getPrice(), getSerialNumber(), getResolutionX(), getResolutionY());
    }
}
