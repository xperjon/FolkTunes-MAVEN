package se.blinfo.folktunes.repository;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xperjon.folktunes.domain.Tune;
import org.xperjon.folktunes.repository.TuneRepository;

/**
 *
 * @author jep
 */
@ContextConfiguration(locations = "classpath:/META-INF/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TuneRepositoryTest {

    
    @Autowired
    TuneRepository tuneRepository;
    
    public TuneRepositoryTest() {
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    @Test
    public void testHello() {
        long count = tuneRepository.count();
        System.out.println("Tunes: "+count);
    }
    
    @Test
    public void createTune() {
        tuneRepository.save(new Tune("8", "Polska från Jämtland"));
    }
}
