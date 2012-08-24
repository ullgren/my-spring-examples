package propertyplaceholder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PropertyPlaceholderTests {
	
	ApplicationContext context;
	
	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(
				"classpath:/propertyplaceholder/internal/application-config.xml");
	}
	
	@Test
	public void testName() {
		ClientService defaultService = (ClientService) context.getBean("clientService");
		assertEquals("Kalle Anka", defaultService.getName());
		assertSame(context, defaultService.getContext());
	}

}
