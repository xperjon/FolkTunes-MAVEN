package org.xperjon.folktunes.domain;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.support.index.IndexType;
import org.xperjon.folktunes.domain.source.SourceOfKnowledge;

/**
 * Created 2013-dec-13
 *
 * @author jep
 */
@NodeEntity
public class Person implements SourceOfKnowledge{

    @GraphId
    Long nodeId;
    @Indexed(unique = true)
    String id;
    @Indexed(indexType = IndexType.FULLTEXT, indexName = "people")
    private String name;

    protected Person() {
    }

    protected Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
