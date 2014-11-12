package ru.karinuss.lib;

/**
 * Created by karina on 31.10.14.
 */

public class Coordinates implements Comparable<Coordinates> {

    private Long x;
    private Long y;

    public Coordinates() {

    }

    public Coordinates(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public int compareTo(Coordinates coordinates) {
        if ((coordinates.getX() == x) && (coordinates.getY() == y))
            return 0;

        if ((coordinates.getX() > x) || (coordinates.getY() > y))
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
