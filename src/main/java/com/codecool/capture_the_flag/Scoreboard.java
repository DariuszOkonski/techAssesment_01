package main.java.com.codecool.capture_the_flag;

import main.java.com.codecool.capture_the_flag.actors.Player;
import main.java.com.codecool.capture_the_flag.actors.PlayerTeam;

import java.util.List;

/**
 * Static class with extension methods for reports about players' performance during the game
 * */
public class Scoreboard {

    /**
     * Returns a collection f all players, sorted by their score (from highest to lowest)
     *
     * @param players
     * @return
     * */
    public static List<Player> getRankedPlayers(List<Player> players) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns a collection of all players, from given team, sorted by their score
     * (from highest to lowest)
     *
     * @param players
     * @param team
     * @return
     * */
    public static List<Player> getRankedPlayersInTeam(List<Player> players, PlayerTeam team) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns the team that has the greatest amount of points scored by its players
     *
     * @param players
     * @return
     * */
    public static PlayerTeam getWinningTeam(List<Player> players) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns amount of dead players
     *
     * @param players
     * @return
     * */
    public static int getDeadPlayersAmount(List<Player> players) {
        throw new RuntimeException("Method not implemented");
    }

    /**
     * Returns full scoreboard string for current game (see the example)
     *
     * @param players
     * @return
     * */
    public static String getScoreboard(List<Player> players) {
        // Team Rock Adam Points: 20
        // Team Paper Eve Points: 10
        // Team Scissors Abel Points: 5 DEAD

        throw new RuntimeException("Method not implemented");
    }

}






























