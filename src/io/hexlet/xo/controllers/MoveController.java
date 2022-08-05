package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.XOExceptions;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws XOExceptions {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException(){};
        }
        field.setFigure(point, figure);
    }

}
