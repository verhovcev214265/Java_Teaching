package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task2;

public class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }
}
