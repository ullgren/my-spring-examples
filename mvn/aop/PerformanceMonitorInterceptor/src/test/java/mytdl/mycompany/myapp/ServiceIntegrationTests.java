package mytdl.mycompany.myapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceIntegrationTests {
	ApplicationContext context;

	@Before
        public void setUp() {
                this.context = new ClassPathXmlApplicationContext("classpath:system-test.xml" );
        }

	@Test
        public void testServiceA() {
                AppService service = context.getBean("ServiceA", AppService.class);
		service.execute("Hello");
        }

	@Test
        public void testServiceB() {
                AppService service = context.getBean("ServiceB", AppService.class);
		service.execute("Godbye");
        }


}
