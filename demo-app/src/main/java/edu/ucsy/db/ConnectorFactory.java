package edu.ucsy.db;

import edu.ucsy.db.impl.ManualConnector;

public abstract class ConnectorFactory {

	public static DatabaseConnector getConnector() {
		return new ManualConnector();
	}
}
