package net.codejava.hibernate.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;


public class DbUtil {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
 	<bean 	id="dbUtil" 
 			class="com.studytrails.tutorials.springhibernatedaosupport.DbUtil" 
 			init-method="initialize">
		<property name="dataSource" ref="dataSource_mysql"/>
	</bean> */
	public void initialize() {

		// CREATE DATABASE PRODUCTSDB; (mysql -u gizaoui -h localhost -pgizaoui)
		DataSource dataSource = getDataSource();

		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			
		
			statement
			.executeUpdate(	
				"CREATE TABLE IF NOT EXISTS FAMILLE ( " + 
					" FAMILLE_ID INT(11) NOT NULL AUTO_INCREMENT, " + 
					" NAME VARCHAR(45) NOT NULL, " + 
					" PRIMARY KEY (FAMILLE_ID) " + 
				")"
			);
			
						
			statement
			.executeUpdate(	
				"CREATE TABLE IF NOT EXISTS ARTICLE ( " + 
					" ARTICLE_ID INT(11) NOT NULL AUTO_INCREMENT, " + 
					" TITLE VARCHAR(70) NOT NULL, " + 
					" DESCRIPTION VARCHAR(250) NOT NULL, " + 
					" KEYWORDS VARCHAR(150) NOT NULL, " +
					" CONTENT TEXT NOT NULL, " +
					" PRIMARY KEY (ARTICLE_ID) " +
				")"
			);

			
			statement
			.executeUpdate(	
				"CREATE TABLE IF NOT EXISTS FAMILLEARTICLE ( " + 
					" FAMILLE_ID INT(11) NOT NULL, " + 
					" ARTICLE_ID INT(11) NOT NULL, " +
					" PRIMARY KEY (FAMILLE_ID,ARTICLE_ID), " +
					" KEY FK_FAMILLE (FAMILLE_ID), " +
					" KEY FK_ARTICLE (ARTICLE_ID), " +
					" CONSTRAINT FK_ARTICLE FOREIGN KEY (ARTICLE_ID) REFERENCES ARTICLE (ARTICLE_ID), " +
					" CONSTRAINT FK_FAMILLE FOREIGN KEY (FAMILLE_ID) REFERENCES FAMILLE (FAMILLE_ID) " +
				")"
			);
		
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}