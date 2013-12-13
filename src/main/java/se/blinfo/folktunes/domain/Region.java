package se.blinfo.folktunes.domain;

import java.util.Set;
import static org.neo4j.graphdb.Direction.INCOMING;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.support.index.IndexType;

/**
 *
 * @author jep
 */
@NodeEntity
public class Region {

    @GraphId
    Long nodeId;

    @Indexed(unique = true)
    String id;

    @Indexed(indexType = IndexType.FULLTEXT, indexName = "search")
    private String name;

//    Värmland,
//    Dalarna,
//    Skåne,
//    Hälsingland,
//    Jämtland,
//    Uppland,
//    Närke,
//    Ångermanland,
//    Medelpad,
//    Södermanland,
//    Västmanland,
//    Dalsland,
//    Småland,
//    Östergötland
    public Region() {
    }

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
