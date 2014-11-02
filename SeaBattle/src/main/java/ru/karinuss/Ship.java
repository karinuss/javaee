package ru.karinuss;

import java.util.Set;
import javax.validation.constraints.NotNull;

/**
 * Created by karina on 31.10.14.
 */
// fixme "add logging"
public class Ship {

    private Set<Coordinates> coords;
    private Long id;
    private Integer hits;

    public Ship(@NotNull Set<Coordinates> coords) {
        this.coords = coords;
    }

    public Ship(Long id, @NotNull Set<Coordinates> coords) {
        this.coords = coords;
        this.id = id;
    }

    public Set<Coordinates> getCoords() {
        return coords;
    }


    public void setCoords(@NotNull Set<Coordinates> coords) {
        this.coords = coords;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public void incrementHits() {
        hits++;
    }

    public boolean isHit(Coordinates point) {

        for(Coordinates c : coords) {

            if(c.compareTo(point) == 0)
                return true;
        }

        return false;
    }


    public int getLength() {
        return coords.size();
    }

    @Override
    public String toString() {
        return "Ship{" +
                "coords=" + coords +
                ", id=" + id +
                ", hits=" + hits +
                '}';
    }
}
