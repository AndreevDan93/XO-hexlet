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
        Point point = new Point(0,0);
        field.setFigure(point,figure);

        assertEquals(Figure.O,field.getFigure(point));
    }
}