package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        String inputValue = "Slava";
        String expectedValue = inputValue;
        final Player player = new Player(inputValue, null);
        assertEquals(expectedValue,player.getName());
    }

    @Test
    void getFigure() {
        Figure inputFigure = Figure.X;
        Figure expectedValue = inputFigure;
        final Player player = new Player(null, inputFigure);
        assertEquals(inputFigure,player.getFigure());
    }
}