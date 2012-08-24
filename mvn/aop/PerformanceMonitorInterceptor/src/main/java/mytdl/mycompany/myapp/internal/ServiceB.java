package mytdl.mycompany.myapp.internal;

import mytdl.mycompany.myapp.AppService;
import org.apache.log4j.Logger;

public class ServiceB implements AppService {
	private static final Logger LOG = Logger.getLogger(ServiceA.class);

	public void execute(String args) {
		LOG.info("Executing ServiceB with argument " + args);
	}
}
