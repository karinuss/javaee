package ru.karinuss.lib;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by karina on 31.10.14.
 */
public final class BattleMapFactory {

    private static final Integer DEFAULT_MAP_HEIGHT = 10;
    private static final Integer DEFAULT_MAP_WEIGHT = 10;
    private static final Integer DEFAULT_MAP_SHIPS = 2;

    static public BattleMap getBattleMap() {
        return getBattleMap(DEFAULT_MAP_HEIGHT, DEFAULT_MAP_WEIGHT, DEFAULT_MAP_SHIPS);
    }

    static public BattleMap getBattleMap(Integer height, Integer width) {
        return getBattleMap(height, width, DEFAULT_MAP_SHIPS);
    }

    static public BattleMap getBattleMap(Integer height, Integer width, Integer numShips) {

        Set<Ship>  ships = createShips(height, width, numShips);
        BattleMap map = new BattleMap(height, width, ships);
        return map;
    }

    static private Set<Ship> createShips(int height, int width, int numShips) {
        Set<Ship> ships = new HashSet<Ship>();

            // todo

        return  ships;
    }
}
