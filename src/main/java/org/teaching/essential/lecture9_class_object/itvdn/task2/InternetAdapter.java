package org.teaching.essential.lecture9_class_object.itvdn.task2;

import java.util.Objects;

public class InternetAdapter extends Device{

    private final int speed;
    private final String mac;

    public InternetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (!(other instanceof InternetAdapter)) return false;
        InternetAdapter internetAdapter = (InternetAdapter) other;
        return speed == internetAdapter.speed && Objects.equals(mac, internetAdapter.mac);
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getSpeed(), getMac());
    }
}
