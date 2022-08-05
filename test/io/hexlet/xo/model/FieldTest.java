package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void getFieldSize() {
        final Field field = new Field();

        assertEquals(3, field.getFieldSize());
    }


    @Test
    void setFigure() {
        final Field field = new Field();
        Figure figure = Figure.O;
        Point point1 = new Point(0,0);
        Point point2 = new Point(-1, 0);
        Point point3 = new Point(0,-1);
        Point point4 = new Point(4,4);
        field.setFigure(point1,figure);
        field.setFigure(point2,figure);
        field.setFigure(point2,figure);
        field.setFigure(point2,figure);

        assertEquals(Figure.O,field.getFigure(point1));
        assertEquals(Figure.O,field.getFigure(point2));
        assertEquals(Figure.O,field.getFigure(point3));
        assertEquals(Figure.O,field.getFigure(point4));
    }
}