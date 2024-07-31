package edu.ucsy.controller;

import java.io.IOException;

import javax.sql.DataSource;

import edu.ucsy.db.ConnectorFactory;
import edu.ucsy.model.dto.AddUserForm;
import edu.ucsy.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserController extends AbstractController {

	private static final long serialVersionUID = 1L;
	
	@Resource(name = "demo")
	private DataSource dataSource;
	private UserService userService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.userService = new UserService(ConnectorFactory.getConnector(dataSource));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var name = req.getParameter("name");
		var email = req.getParameter("email");
		
		if(null != name && !name.isBlank() && 
				null != email && !email.isBlank()) {
			var form = new AddUserForm(name, email);
			userService.addUser(form);
			req.getSession(true).setAttribute("success", "Added %s Successfully".formatted(name));
			redirect(req, resp, "/home");
		}
	}
}
