package org.xperjon.folktunes.domain;

import java.util.HashSet;
import java.util.Set;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Created 2011-nov-16
 *
 * @author jep
 */
public class FolkMusician extends Person {

    public FolkMusician(String id, String name) {
        super(id, name);
    }

    @RelatedTo(type = "IS_FROM")
    private Region region;

    @RelatedTo(type = "IS_FROM")
    private Location location;

    @RelatedTo(elementClass = Tune.class, type = "COMPOSED")
    private Set<Tune> composedTunes = new HashSet<Tune>();

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Tune> getComposedTunes() {
        return composedTunes;
    }

    public void composed(Tune tune) {
        this.composedTunes.add(tune);
    }

}
