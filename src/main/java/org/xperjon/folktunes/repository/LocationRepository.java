package org.xperjon.folktunes.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.xperjon.folktunes.domain.Location;

/**
 *
 * @author jep
 */
public interface LocationRepository extends GraphRepository<Location>{
    
}
