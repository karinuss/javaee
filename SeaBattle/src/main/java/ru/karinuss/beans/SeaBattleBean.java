package ru.karinuss.beans;

import ru.karinuss.lib.BattleMap;
import ru.karinuss.lib.Coordinates;

import javax.ejb.Stateful;

/**
 * Created by karina on 31.10.14.
 */
@Stateful
public class SeaBattleBean implements SeaBattleInterface {

    private BattleMap mapUser, mapComputer;

    @Override
    public boolean isHit(Coordinates coordinates) {
        return false;
    }
}
