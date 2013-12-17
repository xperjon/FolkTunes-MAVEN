package org.xperjon.folktunes.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.support.index.IndexType;

/**
 *
 * @author jep
 */
@NodeEntity
public class Location {

    @GraphId
    Long nodeId;

    @Indexed(unique = true)
    String id;

    @Indexed(indexType = IndexType.FULLTEXT, indexName = "search")
    private String name;

    private Long posLat;
    private Long posLong;

    public Location(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    Boda,
//    Delsbo,
//    Rättvik,
//    Orsa,
    public Location() {
    }

}
