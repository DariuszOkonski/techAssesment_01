package com.codecool.capture_the_flag;

import com.codecool.capture_the_flag.actors.Actor;
import com.codecool.capture_the_flag.actors.ActorFactory;
import com.codecool.capture_the_flag.actors.Flag;
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

    /**
     * Contains all players present on the map (also captured ones)
     * */
    private final List<Flag> flags;


    /**
     * Returns a new GameMap instance, constructed from given char matrix
     * */
    public GameMap(String charMatrix) {
        String[] lines = charMatrix.split(System.lineSeparator());
        actorMatrix = new Actor[lines.length][lines[0].length()];
        this.players = new ArrayList<>();
        this.flags = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            for (int y = 0; y < lines.length; y++) {
                Actor fromChar = ActorFactory.createFromChar(chars[y], this);
                if(fromChar instanceof Player) {
                    players.add((Player) fromChar);
                } else if(fromChar instanceof Flag) {
                    flags.add((Flag) fromChar);
                }
                actorMatrix[i][y] = fromChar;
            }

        }
    }


}































