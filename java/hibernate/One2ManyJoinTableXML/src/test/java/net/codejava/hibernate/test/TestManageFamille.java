package net.codejava.hibernate.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.codejava.hibernate.domaine.Article;
import net.codejava.hibernate.domaine.Famille;
import net.codejava.hibernate.service.ManageFamille;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestManageFamille {

	private static Logger logger = Logger
			.getLogger(TestManageFamille.class);

	@Test
	public void testInsert() throws Exception {

		long start = 0;

		logger.debug("************** BEGINNING PROGRAM **************");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");

		ManageFamille manageFamille = (ManageFamille) context
				.getBean("manageFamille");

		///////////////////////////////////////////////////////////////

		start = System.currentTimeMillis();

		Famille famille = new Famille("Hibernate Framework");

		Article articleOne = new Article("One-to-One Mapping",
				"One-to-One XML Mapping Tutorial", "Hibernate,One-to-One",
				"Content of One-to-One XML Mapping Tutorial", famille);

		Article articleTwo = new Article("One-to-Many Mapping",
				"One-to-Many XML Mapping Tutorial", "Hibernate,One-to-Many",
				"Content of One-to-Many XML Mapping Tutorial", famille);

		Article articleThree = new Article("Many-to-Many Mapping",
				"Many-to-Many XML Mapping Tutorial", "Hibernate,Many-to-Many",
				"Content of Many-to-Many XML Mapping Tutorial", famille);

		Set<Article> articles = new HashSet<Article>();
		articles.add(articleOne);
		articles.add(articleTwo);
		articles.add(articleThree);

		famille.setArticles(articles);


		// persists the product
		manageFamille.clean();
		manageFamille.add(famille);

		///////////////////////////////////////////////////////////////

		logger.debug("Done " + (System.currentTimeMillis() - start) + " ms");
		
		/** /!\ IMPOSSIBLE DE RECUPERER LES ARTICLES */
		
		List<Famille> lstFetchAll = manageFamille.fetchAll();
		logger.debug("Count Famille: " + lstFetchAll.size());
		for (Famille fam : lstFetchAll) {
			 logger.debug(fam);
		}
		
	/*
		List<?> objLst = manageFamille.selectByCriteria();
		logger.debug("Count Famille: " + objLst.size());
		for (Object obj : objLst) {
			 logger.debug(((Famille)obj) );
		}
		
		Famille fam = (Famille) manageFamille.selectByQuery();
		logger.debug( "Première enreg. Famille" + fam );
		*/
	}
}
