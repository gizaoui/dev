package net.codejava.hibernate.test;

import java.util.List;

import net.codejava.hibernate.domaine.Product;
import net.codejava.hibernate.domaine.ProductDetail;
import net.codejava.hibernate.service.ManageService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringHibernateOne2OnePrimKey {

	private static Logger logger = Logger
			.getLogger(TestSpringHibernateOne2OnePrimKey.class);

	@Test
	public void testInsert() throws Exception {

		long start = 0;

		logger.debug("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		ManageService manageService = (ManageService) context
				.getBean("manageService");

		///////////////////////////////////////////////////////////////

		start = System.currentTimeMillis();

		// creates a new product
		Product product = new Product();
		product.setName("Civic");
		product.setDescription("Comfortable, fuel-saving car");
		product.setPrice(20000); 

		// creates product detail
		ProductDetail detail = new ProductDetail();
		detail.setPartNumber("ABCDEFGHIJKL");
		detail.setDimension("2,5m x 1,4m x 1,2m");
		detail.setWeight(1000);
		detail.setManufacturer("Honda Automobile");
		detail.setOrigin("Japan");

		// sets the bi-directional association
		product.setProductDetail(detail);
		detail.setProduct(product);

		// persists the product
		manageService.clean();
		manageService.add(product);
		
		///////////////////////////////////////////////////////////////

		logger.debug("Done " + (System.currentTimeMillis() - start) + " ms");
		List<?> productLst =    manageService.fetchAll(Product.class);
		logger.debug("Count Product: " + productLst.size());
		for (Object prod : productLst) {
			logger.debug(((Product)prod));
		}
		
		
	}
}
