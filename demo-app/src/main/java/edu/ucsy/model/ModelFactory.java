package edu.ucsy.model;

import edu.ucsy.db.DatabaseConnector;
import edu.ucsy.model.impl.UserModelImpl;

public abstract class ModelFactory {

	public static UserModel getUserModel(DatabaseConnector connector) {
		return new UserModelImpl(connector);
	}
}
