package main.java.com.codecool.capture_the_flag.actors;

import main.java.com.codecool.capture_the_flag.GameMap;

/**
 * Scissors player class
 * */
public class Scissors extends Player{

    public Scissors(String name, GameMap mapReference) {
        super(name, mapReference);
        this.letter = 'S';
    }

    @Override
    public void onGameCycle() {
        throw new RuntimeException("Method not implemented");
    }

    private boolean shouldRun(Actor actor) {
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public int Fight(Player otherPlayer) {
        return 0;
    }

    @Override
    public PlayerTeam getTeam() {
        throw new RuntimeException("Method not implemented");
    }
}
