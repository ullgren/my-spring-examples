package factorytests;

import org.apache.log4j.Logger;

public class PojoClientServiceFactory {
	Logger LOG = Logger.getLogger(PojoClientServiceFactory.class);
	
	private ClientService clientService;
	
   public ClientService getDefaultInstance() {
	   LOG.info("getDefaultInstance() called");
	   if ( this.clientService == null ) {
		   this.clientService = new ClientService();
	   }
	   return this.clientService;
   }
   
   public ClientService createNamedInstance(String name) {
	   LOG.info("createNamedInstance("+name+") called");
	   ClientService clientService = new ClientService();
	   clientService.setName(name);
	   return clientService;
   }
   
   
   
}