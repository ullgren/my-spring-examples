package factorytests;

import org.apache.log4j.Logger;

public class LegacySingleton {
    private static LegacySingleton inst = new LegacySingleton();
    private static final Logger LOG = Logger.getLogger(LegacySingleton.class);
    private String name = "default";
    
    private LegacySingleton() {  }
    
    public static LegacySingleton getInstance(String name) {
    	LOG.info("Called getInstance("+name+")");
    	inst.name = name;
    	return inst;
    }
    
    public String getName() {
		return name;
	}
}