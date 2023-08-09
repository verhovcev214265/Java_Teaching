package org.teaching.lecture1_classes_p1.task2;

/*
Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double getArea (double sideA, double sideB) и периметр
прямоугольника – double getPerimeter (double sideA, double sideB).
 */

public class Rectangle {

    public double getArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    public double getPerimeter(double sideA, double sideB) {
        return (sideA + sideB) * 2;
    }
}
