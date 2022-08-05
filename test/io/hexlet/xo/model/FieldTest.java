package io.hexlet.xo.model;

import io.hexlet.xo.model.Exeptions.InvalidPointException;
import io.hexlet.xo.model.Exeptions.PointAlreadyOccupiedException;
import io.hexlet.xo.model.Exeptions.XOExceptions;
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
    void setFigure() throws XOExceptions {
        final Field field = new Field();
        Figure figure = Figure.O;
        Point point1 = new Point(0,0);
        field.setFigure(point1,figure);
        assertEquals(Figure.O,field.getFigure(point1));

    }

    @Test
    void getFigureWhenXIsNotCorrect() throws InvalidPointException {
        final Field field = new Field();
        Point point1 = new Point(-1,0);
        try {
            field.getFigure(point1);
            fail();
        } catch (final InvalidPointException ignored) {}

    }

    @Test
    void setFigureWhenPointAlreadyOccupied() throws XOExceptions {
        final Field field = new Field();
        Point point1 = new Point(0,0);
        field.setFigure(point1,Figure.O);
        try {
            field.setFigure(point1,Figure.X);
            fail();
        } catch (final PointAlreadyOccupiedException ignored) {}

    }

}