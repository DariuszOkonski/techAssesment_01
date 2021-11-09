package main.java.com.codecool.capture_the_flag.actors;

import main.java.com.codecool.capture_the_flag.GameMap;

/**
 * Base class for all Actors - Players and Flags
 * */
public abstract class Actor {

    protected char letter;
    /**
     * Reference to Game's map
     * */
    protected GameMap mapReference;

    public Actor(GameMap mapReference) {
        this.mapReference = mapReference;
    }

    public GameMap getMapReference() {
        return mapReference;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "letter=" + letter +
                '}' + getClass();
    }
}
