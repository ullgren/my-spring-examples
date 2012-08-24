package example;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Value;

public class ClientService {

	private @Value("#{testProperties['name']}") String name;
	private @Value("#{testProperties['extra'].split(',')}")List<String> extraValues;

	
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

	public void setExtraValues(List<String> extraValues) {
		this.extraValues = extraValues;
	}
	
	public List<String> getExtraValues() {
		return this.extraValues;
	}
	
	public ApplicationContext getContext() {
		return context;
	}
}
