package edu.ucsy.service;

import java.util.List;

import edu.ucsy.db.DatabaseConnector;
import edu.ucsy.model.ModelFactory;
import edu.ucsy.model.UserModel;
import edu.ucsy.model.dto.AddUserForm;
import edu.ucsy.model.dto.vo.UserVo;
import edu.ucsy.model.entity.User;

public class UserService {

	private UserModel userModel;
	
	public UserService(DatabaseConnector connector) {
		this.userModel = ModelFactory.getUserModel(connector);
	}

	public List<UserVo> getAllUsers() {
		var users = userModel.getAll();
		
//		List<UserVo> userVoList = new ArrayList<>();
//		
//		for(var u : users) {
//			userVoList.add(new UserVo(u));
//		}
		var userVoList = users.stream().map(UserVo::new).toList();
		return userVoList;
	}

	public void addUser(AddUserForm form) {
		var user = new User(form.getName(), form.getEmail());
		userModel.save(user);
	}

	public boolean deleteUser(int id) {
		var result = userModel.delete(id);
		return result;
	}
}
