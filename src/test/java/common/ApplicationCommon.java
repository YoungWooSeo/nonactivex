package common;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/resources/spring-config-context.xml", 
        "file:src/resources/spring-config-mybatis.xml" 
            })
@WebAppConfiguration
public class ApplicationCommon {
    @Autowired ApplicationContext ctx;
}
