package main.java.com.codecool.capture_the_flag.actors;

import main.java.com.codecool.capture_the_flag.GameMap;

/**
 * PlayerTeam enum
 * */
public enum PlayerTeam {
    ROCK,
    PAPER,
    SCISSORS;

    public Player createPlayer(String name, GameMap mapReference) {
        throw new RuntimeException("Method not implemented");
    }
}