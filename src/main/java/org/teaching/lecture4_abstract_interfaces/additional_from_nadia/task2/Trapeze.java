package org.teaching.lecture4_abstract_interfaces.additional_from_nadia.task2;

public class Trapeze extends Shape {

    private final double baseA;
    private final double baseB;
    private final double weight;

    public Trapeze(double baseA, double baseB, double weight) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.weight = weight;
    }

    @Override
    public double area() {
        return (this.baseA + this.baseB) * this.weight / 2;
    }
}
