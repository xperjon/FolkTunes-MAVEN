package org.xperjon.folktunes.domain;

import static org.neo4j.graphdb.Direction.INCOMING;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;
import org.springframework.data.neo4j.support.index.IndexType;

/**
 * Created 2011-nov-16
 *
 * @author jep
 */
@NodeEntity
public class Tune {

    @GraphId
    Long nodeId;

    @Indexed(unique = true)
    String id;

    @Indexed(indexType = IndexType.FULLTEXT, indexName = "search")
    private String name;

    private TuneType type;
    private Beat beat;

    @RelatedTo(type = "FROM", direction = INCOMING)
    private Region region;
    @RelatedTo(type = "FROM", direction = INCOMING)
    private Location location;
    
    @RelatedTo(type = "COMPOSER", direction = INCOMING)
    private FolkMusician composer;

    @RelatedToVia(type = "LEARNED_FROM", direction = INCOMING)
    private From from;

    public Tune() {
    }

    public Tune(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public From getFrom() {
        return from;
    }

    public FolkMusician getComposer() {
        return composer;
    }

    public Location getLocation() {
        return location;
    }

    public Beat getBeat() {
        return beat;
    }

    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    public Region getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TuneType getType() {
        return type;
    }

    public void setType(TuneType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tune{" + "name=" + name + '}';
    }

}
