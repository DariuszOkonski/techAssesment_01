package com.codecool.capture_the_flag;

public class Main {

    public static final String testMap = "FFFFFFFFFFFFFFFF" + System.lineSeparator() + "F..............F"
            + System.lineSeparator() + "F..............F" + System.lineSeparator() + "F..PRSPRSPRSP..F"
            + System.lineSeparator() + "F..S........R..F" + System.lineSeparator() + "F..R........S..F"
            + System.lineSeparator() + "F..P..FFFF..P..F" + System.lineSeparator() + "F..S..FFFF..R..F"
            + System.lineSeparator() + "F..R..FFFF..S..F" + System.lineSeparator() + "F..P..FFFF..P..F"
            + System.lineSeparator() + "F..S........R..F" + System.lineSeparator() + "F..R........S..F"
            + System.lineSeparator() + "F..PSRPSRPSRP..F" + System.lineSeparator() + "F..............F"
            + System.lineSeparator() + "F..............F" + System.lineSeparator() + "FFFFFFFFFFFFFFFF";


    public static void main(String[] args) {
        GameMap gameMap = new GameMap(testMap);
        Game game = new Game(gameMap);

        game.simulateGame();
    }
}
