package ru.karinuss;

import java.util.List;
import javax.ejb.Remote;

/**
 * Created by karina on 24.10.14.
 */
@Remote
public interface RegionInterfaceRemote {

    public List<Region> getRegions();
    public void addRegion(Region region);

}
