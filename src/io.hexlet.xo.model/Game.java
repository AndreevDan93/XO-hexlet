package io.hexlet.xo.model;

public class Game {
    private final Player[] players;
    private final Field[][] fields;
    private final String name;

    public Game(Player[] players, Field[][] fields, String name) {
        this.players = players;
        this.fields = fields;
        this.name = name;
    }

    public Field[][] getFields() {
        return fields;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }
}
