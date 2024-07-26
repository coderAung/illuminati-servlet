package edu.ucsy.model.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ucsy.db.DatabaseConnector;
import edu.ucsy.model.UserModel;
import edu.ucsy.model.entity.User;
import edu.ucsy.model.entity.User.Role;

public class UserModelImpl implements UserModel {
	
	private DatabaseConnector connector;
	
	public UserModelImpl(DatabaseConnector connector) {
		this.connector = connector;
	}

	@Override
	public User save(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		
		var sql = "select * from users";
		var users = new ArrayList<User>();
		
		try(var conn = connector.getConnection();
				var stmt = conn.prepareStatement(sql);) {
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				var u = new User(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						Role.valueOf(rs.getString(5).toUpperCase()));
				
				users.add(u);
			}
			return users;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}
