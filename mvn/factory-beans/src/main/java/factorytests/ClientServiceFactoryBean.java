package factorytests;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.FactoryBean;

public class ClientServiceFactoryBean implements  FactoryBean<ClientService> {	
	
	Logger LOG = Logger.getLogger(ClientServiceFactoryBean.class);

	private ClientService clientService;
	
	
	public ClientServiceFactoryBean(String name) {
		this.clientService = new ClientService();
		this.clientService.setName(name);
	}
	
	public ClientService getObject() throws Exception {
		LOG.info("getObject() called");
		return clientService;
	}

	public Class<?> getObjectType() {
		return ClientService.class;
	}
	
	// If isSingelton returns true getObject will only be called once
	public boolean isSingleton() { 
		return true; 
	}
}