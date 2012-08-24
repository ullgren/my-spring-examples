package factorytests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import factorytests.ClientService;
import factorytests.LegacySingleton;

public class FactorytestTests {
	
	ApplicationContext context;
	
	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext(
				"classpath:/factorytests/internal/application-config.xml");
	}
	
	@Test
	public void testLegacySingleton() {
		LegacySingleton singleton = (LegacySingleton) context.getBean("legacySingleton");
		assertEquals("Test", singleton.getName());
	}
	
	@Test
	public void testPojoFactoryBean() {
		ClientService defaultService = (ClientService) context.getBean("clientService");
		assertEquals("Default", defaultService.getName());
		ClientService namedService = (ClientService) context.getBean("clientService2");
		assertEquals("Kalle", namedService.getName());
	}
	
	@Test
	public void testFactoryBeanInterface() {
		ClientService defaultService = (ClientService) context.getBean("clientService3");
		ClientService defaultService2 = (ClientService) context.getBean("clientService3");
		
		assertEquals("Kalle", defaultService.getName());
		assertSame(defaultService, defaultService2);
	}

}
