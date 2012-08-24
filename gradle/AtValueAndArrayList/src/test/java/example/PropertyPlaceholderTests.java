package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PropertyPlaceholderTests {
	
	ApplicationContext context;
	
	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/application-config.xml");
	}
	
	@Test
	public void testNameAndExtraValues() {
		ClientService defaultService = (ClientService) context.getBean("clientService");
		assertEquals("Kalle Anka", defaultService.getName());
		assertNotNull(defaultService.getExtraValues());
		assertEquals(2, defaultService.getExtraValues().size());
		assertSame(context, defaultService.getContext());
	}

}
