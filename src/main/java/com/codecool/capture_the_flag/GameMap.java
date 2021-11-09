package main.java.com.codecool.capture_the_flag;

import main.java.com.codecool.capture_the_flag.actors.Actor;
import main.java.com.codecool.capture_the_flag.actors.ActorFactory;
import main.java.com.codecool.capture_the_flag.actors.Flag;
import main.java.com.codecool.capture_the_flag.actors.Player;
import main.java.com.codecool.capture_the_flag.util.Direction;

import java.util.ArrayList;
import java.util.List;
import main.java.com.codecool.capture_the_flag.util.*;

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

    /**
     * Returns a char matrix of map's current state
     *
     * @return
     * */
    @Override
    public String toString() {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns an actor instance present on given position
     * Should return null if no actor is present
     * Should throw an IllegalArgumentException if the position is outside map's boundaries
     *
     * @param position
     * @return
     * */
    public Actor getActor(Vector position) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns a position of given actor instance
     * Should throw an IllegalArgumentException if actor is not found or no actor is given
     *
     * @param actor
     * @return
     * */
    public Vector getPosition(Actor actor) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Assigns given actor to given position
     * Should throw an IllegalArgumentException if the position is occupied by an another actor
     *
     * @param actor
     * @param position
     * */
    public void setPosition(Actor actor, Vector position) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Attempts to move given player to a new position
     * if necessary, restricts movement or simulates fights between players
     *
     * @param player
     * @param currentPosition
     * @param dir
     * */
    public void tryMovePlayer(Player player, Vector currentPosition, Direction dir) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns the position of an uncaptured flag that is closest to given palyer
     * Sould throw IllegalArgumentException if there are no uncaptured flags
     *
     * @param player
     * @return
     * */

    public Vector getNearestFlagPosition(Player player) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns true if given position is within the map's boundaries
     *
     * @param position
     * @return
     * */
    public boolean withinBoundaries(Vector position) {
        throw new RuntimeException("Method not implemented");
    }

    public Actor[][] getActorMatrix() {
        return actorMatrix;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Flag> getFlags() {
        return flags;
    }
}































