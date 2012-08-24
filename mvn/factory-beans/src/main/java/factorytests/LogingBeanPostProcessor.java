package factorytests;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LogingBeanPostProcessor implements BeanPostProcessor {
	
	Logger LOG = Logger.getLogger(LogingBeanPostProcessor.class);
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		LOG.info("postProcessBeforeInitialization("+bean+", "+ beanName+ ")");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		LOG.info("postProcessAfterInitialization("+bean+", "+ beanName+ ")");
		return bean;
	}

}
