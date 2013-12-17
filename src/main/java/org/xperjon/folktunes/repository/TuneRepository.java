
package org.xperjon.folktunes.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.xperjon.folktunes.domain.Tune;

/**
 *
 * @author jep
 */
public interface TuneRepository extends GraphRepository<Tune>{
    
}
