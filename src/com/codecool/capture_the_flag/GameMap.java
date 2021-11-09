package com.codecool.capture_the_flag;

import com.codecool.capture_the_flag.actors.Actor;
import com.codecool.capture_the_flag.actors.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * GameMap class
 * */
public class GameMap {

    /**
     * A 2D matrix of all actor references (null if the field is empty)
     * */
    private final Actor[][] actorMatrix;

    /**
     * Contains all players present on the map (also dead ones)
     * */
    private final List<Player> players;

    public GameMap(String charMatrix) {
        String[] lines = charMatrix.split(System.lineSeparator());
        actorMatrix = new Actor[lines.length][lines[0].length()];
        this.players = new ArrayList<>();
    }
}
