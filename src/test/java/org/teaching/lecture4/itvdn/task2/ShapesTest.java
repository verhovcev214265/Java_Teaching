package org.teaching.lecture4.itvdn.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class ShapesTest {

    private Shapes shapes;

    @Before
    public void setUp(){
        shapes = new Shapes(3);
        shapes.setShape(new Rectangle(5.0, 5.0));
        shapes.setShape(new Circle(10.0));
        shapes.setShape(new Trapeze(5.0, 5.0, 10.0));
    }

    @Test
    public void testShapes_ByIllegalArgument(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> shapes = new Shapes(4)
        );

        Object expectedMessage = "The number of the shapes shouldn't be more than 3. You have entered: " + 4;
        String actualMessage = exception.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void checkSet(){
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> shapes.setShape(new Circle(11.0))
        );

        String expectedMessage = "Couldn't add another shape because array of shapes are full.";
        String actualMessage = exception.getMessage();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void checkShapesLength(){
        Assert.assertEquals(3, shapes.getShapes().length);
    }

    @Test
    public void shouldReturn_Area_Of_Rectangle(){
        Shape rectangle = shapes.getShapes()[0];

        Assert.assertEquals(25.0, rectangle.area(), 0.001);
    }

    @Test
    public void shouldReturn_Area_of_Circle(){
        Shape circle = shapes.getShapes()[1];

        Assert.assertEquals(314.0, circle.area(), 0.001);
    }

    @Test
    public void shouldReturn_Area_Of_Trapeze(){
        Shape trapeze = shapes.getShapes()[2];

        Assert.assertEquals(50.0, trapeze.area(), 0.001);
    }
}
