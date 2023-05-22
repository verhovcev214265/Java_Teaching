package org.teaching.lecture1.task2;

/*
Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2).
 */

public class Rectangle {

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
