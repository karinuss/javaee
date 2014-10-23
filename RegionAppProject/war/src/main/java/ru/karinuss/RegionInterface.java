package ru.karinuss;

import java.util.List;
import javax.ejb.Local;

/**
 * Created by karina on 21.10.14.
 */
@Local
public interface RegionInterface {

    public List<Region> getRegions();
    public void addRegion(Region region);
}
