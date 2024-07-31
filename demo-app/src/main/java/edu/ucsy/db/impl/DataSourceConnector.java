package edu.ucsy.db.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import edu.ucsy.db.DatabaseConnector;

public class DataSourceConnector implements DatabaseConnector {

	private DataSource dataSource;
	
	public DataSourceConnector(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
	
}
