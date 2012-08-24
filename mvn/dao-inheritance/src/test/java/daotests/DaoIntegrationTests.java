package daotests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.*;

public class DaoIntegrationTests {

	ApplicationContext context;
	
	@Before
	public void setUp() {
		this.context = new ClassPathXmlApplicationContext("classpath:/dao/internal/application-config.xml", "classpath:system-test.xml" );
	}
	
	@Test
	public void testCarDao() {
                CarDao dao = (CarDao) context.getBean("cardao");
		assertNotNull(dao);
		assertNull(dao.findCarBy("ABC123"));
        }

}
