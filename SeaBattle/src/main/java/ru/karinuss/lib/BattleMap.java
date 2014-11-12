package ru.karinuss.lib;

import java.util.Set;

/**
 * Created by karina on 31.10.14.
 */
public class BattleMap {

    private Integer height;
    private Integer width;

    private Set<Ship> ships;
    private Set<Coordinates> hitCoords;


    public BattleMap(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public BattleMap(Integer height, Integer width, Set<Ship> ships) {
        this(height, width);
        this.ships = ships;
    }

    public Set<Ship> getShips() {
        return ships;
    }

    public Set<Coordinates> getHitCoords() {
        return hitCoords;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }
}
