package se.blinfo.folktunes.repository;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xperjon.folktunes.domain.User;
import org.xperjon.folktunes.repository.UserRepository;

/**
 *
 * @author jep
 */
@ContextConfiguration(locations = "classpath:/META-INF/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {
    
    @Autowired
    UserRepository userRepository;
    
    public UserRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        long count = userRepository.count();
         System.out.println("Users: "+count);
     }
     @Test
     public void createUserTest() { 
         userRepository.save(new User("9","Jon-Erik"));
     }
}
