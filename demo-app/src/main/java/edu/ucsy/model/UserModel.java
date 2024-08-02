package edu.ucsy.model;

import java.util.List;

import edu.ucsy.model.entity.User;

public interface UserModel {

	User save(User u);
	
	User findOne(int id);
	
	List<User> getAll();
	
	User update(User u);
	
	boolean delete(User u);
	
	boolean delete(int id);
}
