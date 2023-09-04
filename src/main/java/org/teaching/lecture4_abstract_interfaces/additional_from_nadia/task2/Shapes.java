package org.teaching.lecture4_abstract_interfaces.additional_from_nadia.task2;

/*
Для проверки определите массив
ссылок на абстрактный класс, которым присваиваются адреса различных объектов классов-потомков.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shapes {

    private static final Logger logger = LoggerFactory.getLogger(Shapes.class);


    private int numbersOfShapes;
    private final Shape[] shapes;

    public Shapes(int numbersOfShapes) {
        if (numbersOfShapes > 3) {
            logger.error("The number of the shapes shouldn't be more than 3. You have entered: {}", numbersOfShapes);
            throw new IllegalArgumentException("The number of the shapes shouldn't be more than 3. You have entered: " + numbersOfShapes);
        }

        shapes = new Shape[numbersOfShapes];
    }

    public void setShape(Shape shape) {
        numbersOfShapes++;
        if (numbersOfShapes > shapes.length) {
            logger.error("Couldn't add another shape because array of shapes are full.");
            return;
        }

        this.shapes[numbersOfShapes - 1] = shape;
    }

    public Shape[] getShapes() {
        return shapes;
    }
}
