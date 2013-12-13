package se.blinfo.folktunes.domain;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;
import se.blinfo.folktunes.domain.source.SourceOfKnowledge;

/**
 * Created 2013-dec-13
 *
 * @author jep
 */
@RelationshipEntity(type = "LEARNED_FROM")
public class From {

    @GraphId
    Long id;
    @StartNode
    private SourceOfKnowledge source;
    @EndNode
    private Tune tune;

    public From() {
    }

    public From(SourceOfKnowledge source, Tune tune) {
        this.source = source;
        this.tune = tune;
    }

    public SourceOfKnowledge getSource() {
        return source;
    }

    public Tune getTune() {
        return tune;
    }

}
