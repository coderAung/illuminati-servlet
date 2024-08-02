package edu.ucsy.controller;

import java.io.IOException;

import javax.sql.DataSource;

import edu.ucsy.db.ConnectorFactory;
import edu.ucsy.model.dto.AlertMessage;
import edu.ucsy.model.dto.AlertMessage.Type;
import edu.ucsy.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/user/edit", "/user/delete"})
public class UserDeleteAndEditController extends AbstractController {

	private static final long serialVersionUID = 1L;
	private static final String EDIT_PATH = "/user/edit";
	private static final String DELETE_PATH = "/user/delete";
	
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
		var path = req.getServletPath();
		
		switch(path) {
		case EDIT_PATH:
			break;
		case DELETE_PATH:
			deleteUser(req, resp);
			break;
		default:
			break;
		}
		
	}


	private void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get id and name from req
		var id = Integer.parseInt(req.getParameter("userid"));
		var name = req.getParameter("username");
		
		// delete by userService
		var result = userService.deleteUser(id);
		
		// set message in req
		if(result) {
			var alert = new AlertMessage("Deleted User : '%s' Successfully".formatted(name), Type.DELETED);
			req.getSession(true).setAttribute("alert", alert);
		}
		
		// After deleting user
		redirect(req, resp, "/home");
	}
}
