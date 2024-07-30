package edu.ucsy.controller;

import java.io.IOException;

import edu.ucsy.db.ConnectorFactory;
import edu.ucsy.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/", "/home"})
public class HomeController extends AbstractController {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.userService = new UserService(ConnectorFactory.getConnector());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var users = userService.getAllUsers();
		req.setAttribute("users", users);
		view(req, resp, "index");
	}
}
