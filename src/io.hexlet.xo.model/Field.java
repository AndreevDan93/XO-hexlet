package io.hexlet.xo.model;

import io.hexlet.xo.model.exeptions.InvalidPointException;
import io.hexlet.xo.model.exeptions.PointAlreadyOccupiedException;
import io.hexlet.xo.model.exeptions.XOExceptions;

import java.awt.*;

public class Field {
    private static final int FIELD_SIZE = 3;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 3;
    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getFieldSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if (checkCoordinateForCorrectness(point)) {
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws XOExceptions {
        if (checkCoordinateForCorrectness(point)) {
            throw new InvalidPointException();
        }
        if (!(field[point.x][point.y] == null)) {
            throw new PointAlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkCoordinateForCorrectness(Point point) {
        return point.x < MIN_COORDINATE || point.x > MAX_COORDINATE
                || point.y < MIN_COORDINATE || point.y > MAX_COORDINATE;
    }
}
