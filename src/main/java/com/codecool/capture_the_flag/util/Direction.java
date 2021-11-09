package main.java.com.codecool.capture_the_flag.util;

/**
 * Direction enum
 * */
public enum Direction {
    UP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);

    public final int y;
    public final int x;

    Direction(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public Vector createVector() {
        throw new RuntimeException("Method not implemented");
    }

    public Direction opposite() {
        throw new RuntimeException("Method not implemented");
    }

}
