package mytdl.mycompany.myapp.internal;

import mytdl.mycompany.myapp.AppService;
import org.apache.log4j.Logger;

public class ServiceA implements AppService {
	private static final Logger LOG = Logger.getLogger(ServiceA.class);

	public void execute(String args) {
		LOG.info("Executing ServiceA with argument " + args);
	}
}
