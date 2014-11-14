package ru.karinuss.beans;

import ru.karinuss.lib.BattleMap;
import ru.karinuss.lib.Coordinates;

import javax.ejb.Local;

/**
 * Created by karina on 31.10.14.
 */
@Local
public interface SeaBattleInterface {

    public boolean isHit(Coordinates coordinates);
    public BattleMap getBattleMapUser();
    public BattleMap getBattleMapComputer();
}
