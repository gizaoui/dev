package org.springgarden.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springgarden.IJardinier;



public class TestSringGarden {

	private static Logger logger = Logger.getLogger(TestSringGarden.class);


	/**
	 * Méthode de test
	 */
	@Test
	public void testSpring() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		IJardinier obj = (IJardinier) context.getBean("jardinier");
		logger.debug(obj);

		logger.debug("Done");
	}
	
}
