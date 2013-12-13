package se.blinfo.folktunes.domain;

import java.util.Collection;
import java.util.Set;
import org.springframework.data.neo4j.annotation.RelatedToVia;
import se.blinfo.folktunes.domain.source.SourceOfKnowledge;

/**
 * Created 2011-nov-24
 *
 * @author jep
 */
public class User extends Person {

    @RelatedToVia
    Collection<From> tunes;

    public User(String id, String name) {
        super(id, name);
    }

    public Collection<From> getTunes() {
        return tunes;
    }

    public From learned(Tune tune, SourceOfKnowledge source) {
        From from = new From(source, tune);
        tunes.add(from);
        return from;

    }
}
