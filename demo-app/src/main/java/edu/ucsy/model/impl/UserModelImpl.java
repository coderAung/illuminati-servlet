package edu.ucsy.model.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ucsy.model.UserModel;
import edu.ucsy.model.entity.User;
import edu.ucsy.model.entity.User.Role;

public class UserModelImpl implements UserModel {

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
		
		var url = "jdbc:mysql://localhost:3306/demo_db";
		var user = "root";
		var password = "admin";
		
		var sql = "select * from users";
		var users = new ArrayList<User>();
		
		try(Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(sql);) {
			
			ResultSet rs = stmt.executeQuery();
			
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
