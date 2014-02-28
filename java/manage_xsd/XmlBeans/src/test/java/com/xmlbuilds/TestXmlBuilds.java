package com.xmlbuilds;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestXmlBuilds {

	private static Logger logger = Logger.getLogger(TestXmlBuilds.class);

	@Test
	public void testXmlBuilds() {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
//		IXmlBeans objCorporation = (IXmlBeans) context.getBean("xmlBeansCorporation");
//		logger.debug(objCorporation);
//		objCorporation.ReadFile();
//		
//		IXmlBeans objPurchase = (IXmlBeans) context.getBean("xmlBeansPurchase");
//		logger.debug(objPurchase);
//		objPurchase.ReadFile();
		
		IXmlBeans objEasypo = (IXmlBeans) context.getBean("xmlBeansEasypo");
		logger.debug(objEasypo);
		objEasypo.WriteFile();

		
		logger.debug("Done");
	}

}
