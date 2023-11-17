package org.teaching.essential.lecture7_anonymous_enums.itvdn.task1;

/*
Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
строку с названием экземпляра, цветом и стоимостью автомобиля.
 */

public enum Vehicles {

    BMW(10_000, "Black"), OPEL(3_000, "Red");

    final int price;
    final String color;

    Vehicles(int price, String color){
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Vehicle " + super.toString() +
        ", color is " + color +
                ", price = " + price + ".";
    }

}
