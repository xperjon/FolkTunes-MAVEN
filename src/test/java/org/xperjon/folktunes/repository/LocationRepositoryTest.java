package org.xperjon.folktunes.repository;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.Neo4jHelper;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;
import org.xperjon.folktunes.domain.Location;
import org.xperjon.folktunes.repository.LocationRepository;

/**
 *
 * @author jep
 */
@ContextConfiguration(locations = "classpath:/META-INF/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class LocationRepositoryTest {

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    private static Neo4jTemplate graphDatabaseService;
//    private static GraphDatabaseService graphDatabaseService;

    public LocationRepositoryTest() {
    }

//    @BeforeClass
//    public static void setupClass() {
//        Neo4jHelper.cleanDb(template);
//    }
    @Rollback(false)
    @BeforeTransaction
    public void cleanUpGraph() {
        Neo4jHelper.cleanDb(graphDatabaseService);
    }

    @Test
    public void hello() {
        locationRepository.save(new Location("9", "Delsbo"));
//        long count = locationRepository.count();
//        assertEquals(1L, count);
    }
}
