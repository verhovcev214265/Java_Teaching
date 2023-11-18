package org.teaching.essential.lecture4_abstract_interfaces.additional_from_nadia.task2;

public class Circle extends Shape{

    private static final double PI = 3.14;

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2.0);
    }
}
