package edu.ucsy.model.dto;

import edu.ucsy.model.entity.User;
import edu.ucsy.model.entity.User.Role;

public class LoginUser {

	private int id;
	private String name;
	private String email;
	private Role role;

	public LoginUser(User u) {
		this.id = u.getId();
		this.name = u.getName();
		this.email = u.getEmail();
		this.role = u.getRole();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}