package org.xperjon.folktunes.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.xperjon.folktunes.domain.User;

/**
 * Created 2013-dec-17
 * @author jep
 */
public interface UserRepository extends GraphRepository<User>{

}
