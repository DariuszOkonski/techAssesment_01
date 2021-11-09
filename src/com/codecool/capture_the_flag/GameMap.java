package com.codecool.capture_the_flag;

import com.codecool.capture_the_flag.actors.Actor;

/**
 * GameMap class
 * */
public class GameMap {

    /**
     * A 2D matrix of all actor references (null if the field is empty)
     * */
    private final Actor[][] actorMatrix;

    public GameMap(String charMatrix) {
        String[] lines = charMatrix.split(System.lineSeparator());
        actorMatrix = new Actor[lines.length][lines[0].length()];
    }
}
