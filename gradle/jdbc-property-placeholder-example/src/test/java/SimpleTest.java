import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SimpleTest {
	@Autowired
        ApplicationContext context;

	@Test
	public void testPropertyPlaceholder() {
		String configuredName = context.getBean("configuredName", String.class);
		Assert.assertEquals("Joe Doe", configuredName);
		return;
	}
}
