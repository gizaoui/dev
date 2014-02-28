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
				"CREATE TABLE IF NOT EXISTS PRODUCT ( " + 
					" PRODUCT_ID INT(11) NOT NULL AUTO_INCREMENT, " + 
					" NAME VARCHAR(128) NOT NULL, " + 
					" DESCRIPTION VARCHAR(512) NOT NULL, " + 
					" PRICE FLOAT NOT NULL, " + 
					" PRIMARY KEY (PRODUCT_ID) " + 
				")"
			);
						
			statement
			.executeUpdate(	
				"CREATE TABLE IF NOT EXISTS PRODUCT_DETAIL ( " + 
					" PRODUCT_ID INT(11) NOT NULL, " +
					" PART_NUMBER VARCHAR(45) NOT NULL, " +
					" DIMENSION VARCHAR(45) NOT NULL, " +
					" WEIGHT FLOAT NOT NULL, " +
					" MANUFACTURER VARCHAR(45) NOT NULL, " +
					" ORIGIN VARCHAR(45) NOT NULL, " +
					" PRIMARY KEY (PRODUCT_ID) " +
				")"
			);
			
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}