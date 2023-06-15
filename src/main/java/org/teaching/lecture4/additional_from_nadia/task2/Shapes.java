package org.teaching.lecture4.additional_from_nadia.task2;

/*
Для проверки определите массив
ссылок на абстрактный класс, которым присваиваются адреса различных объектов классов-потомков.
 */

public class Shapes {

    private int numbersOfShapes;
    private Shape[] shapes;

    public Shapes(int numbersOfShapes) {
        if (numbersOfShapes > 3) {
            throw new IllegalArgumentException("The number of the shapes shouldn't be more than 3. You have entered: " + numbersOfShapes);
        }

        shapes = new Shape[numbersOfShapes];
    }

    public void setShape(Shape shape) {
        numbersOfShapes++;
        if (numbersOfShapes > shapes.length) {
            throw new IllegalArgumentException("Couldn't add another shape because array of shapes are full.");
        }

        this.shapes[numbersOfShapes - 1] = shape;
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
