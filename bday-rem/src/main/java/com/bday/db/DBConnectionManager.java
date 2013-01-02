package com.bday.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager {
	
	public static Connection getConnection() throws Exception{
		// load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");
	    
		Connection connection = null;
		try{
			connection = DriverManager.getConnection("jdbc:sqlite:e:/sqlite/bday.db");

		}catch (Exception ex){
			ex.printStackTrace();
		}

		
		return connection;
		
	}
	

}
