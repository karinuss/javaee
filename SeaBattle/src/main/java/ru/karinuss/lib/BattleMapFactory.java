package ru.karinuss.lib;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by karina on 31.10.14.
 */
public final class BattleMapFactory {

    private static final Integer DEFAULT_MAP_HEIGHT = 10;
    private static final Integer DEFAULT_MAP_WEIGHT = 10;
    private static final Integer DEFAULT_MAP_SHIPS = 4;
    private static Set<Ship> DEFAULT_SHIPS;

    static {
        DEFAULT_SHIPS = new HashSet<Ship>(DEFAULT_MAP_SHIPS);
        // todo: add ships

    }

    static public BattleMap getBattleMap() {
        return createDefaultBattleMap();
    }

    static private BattleMap createDefaultBattleMap() {

        BattleMap map = new BattleMap(DEFAULT_MAP_HEIGHT, DEFAULT_MAP_WEIGHT, DEFAULT_SHIPS);
        return map;
    }

    /*
    static public BattleMap getBattleMap(Integer height, Integer width, Integer numShips) {

        Set<Ship>  ships = createShips(height, width, numShips);
        BattleMap map = new BattleMap(height, width, ships);
        return map;
    }

    static private Set<Ship> createShips(int height, int width, int numShips) {
        Set<Ship> ships = new HashSet<Ship>();
            // todo
        return  ships;
    } */
}
