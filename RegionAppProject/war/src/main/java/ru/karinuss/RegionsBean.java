package ru.karinuss;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by karina on 21.10.14.
 */
@Stateful
public class RegionsBean implements RegionInterface,Serializable {

    private List<Region> regions;

    @Override
    public List<Region> getRegions() {
        if(regions == null) {
            regions = new ArrayList<Region>();
            addRegion(new Region("Trivandrum"));
        }

        return regions;
    }

    @Override
    public void addRegion(Region region) {
         if(regions == null)
             regions = new ArrayList<Region>();

        long count = (long)regions.size();
        region.setId(++count);
        regions.add(region);
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

}
