package edu.ucsy.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import edu.ucsy.db.DatabaseConnector;

public class ManualConnector implements DatabaseConnector {
	
	private static final String URL = "jdbc:mysql://localhost:3306/demo_db";
	private static final String USER = "root";
	private static final String PASSWORD = "admin";

	@Override
	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
