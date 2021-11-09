package com.codecool.capture_the_flag.actors;

import com.codecool.capture_the_flag.GameMap;

/**
 * Rock player class
 * */
public class Rock extends Player{
    public Rock(String name, GameMap mapReference) {
        super(name, mapReference);
        this.letter = 'R';
    }

    @Override
    public void onGameCycle() {
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
