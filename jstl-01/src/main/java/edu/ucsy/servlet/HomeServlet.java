package edu.ucsy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.ucsy.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Aung Aung", "member"));
		users.add(new User(2, "Su Su", "admin"));

		req.setAttribute("users", users);
		
		getServletContext().getRequestDispatcher("/home.jsp").forward(req, resp);
	}
}
