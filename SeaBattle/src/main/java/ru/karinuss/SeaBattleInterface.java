package ru.karinuss;

import javax.ejb.Local;

/**
 * Created by karina on 31.10.14.
 */
@Local
public interface SeaBattleInterface {

    public boolean isHit(Coordinates coordinates);

}
