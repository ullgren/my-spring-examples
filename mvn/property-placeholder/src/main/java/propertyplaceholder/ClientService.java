package propertyplaceholder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class ClientService {
	private String name = "Default";
	
	// The application context can be injected using @Autowired
	// This could also have been done by implementing org.springframework.context.ApplicationContextAware 
	// (See ApplicationContextAware#setApplicationContext(ApplicationContext))
	@Autowired
	private ApplicationContext context;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ApplicationContext getContext() {
		return context;
	}
}
