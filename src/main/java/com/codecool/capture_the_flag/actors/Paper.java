package main.java.com.codecool.capture_the_flag.actors;

import main.java.com.codecool.capture_the_flag.GameMap;

/**
 * Paper player class
 * */
public class Paper extends Player{


    public Paper(String name, GameMap mapReference) {
        super(name, mapReference);
        this.letter = 'P';
    }

    @Override
    public void onGameCycle() {
        throw new RuntimeException("Method not implemented");
    }

    private boolean isActorEnemy(Actor actor) {
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
