package edu.ucsy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.ucsy.model.UserModel;
import edu.ucsy.model.entity.User;
import edu.ucsy.model.impl.UserModelImpl;

public class UserModelTest {

	private static UserModel userModel;
	
	@BeforeAll
	static void init() {
		userModel = new UserModelImpl();
	}
	
	@Test
	void test_getAll() {
		var users = userModel.getAll();
		
		assertNotNull(users);
		assertEquals(5, users.size());
		
		users.forEach(this::show);
	}
	
	private void show(User u) {
		System.out.printf("Id       : %s%n", u.getId());
		System.out.printf("Name     : %s%n", u.getName());
		System.out.printf("Email    : %s%n", u.getEmail());
		System.out.printf("Password : %s%n", u.getPassword());
		System.out.printf("Role     : %s%n", u.getRole().toString());
		System.out.println("-------------------------");
	}
}
