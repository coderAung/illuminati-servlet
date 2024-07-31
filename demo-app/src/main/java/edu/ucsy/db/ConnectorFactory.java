package edu.ucsy.db;

import javax.sql.DataSource;

import edu.ucsy.db.impl.DataSourceConnector;
import edu.ucsy.db.impl.ManualConnector;

public abstract class ConnectorFactory {

	public static DatabaseConnector getConnector() {
		return new ManualConnector();
	}
	
	public static DatabaseConnector getConnector(DataSource dataSource) {
		return new DataSourceConnector(dataSource);
	}
}
