package edu.ucsy.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class AbstractController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void view(HttpServletRequest req, HttpServletResponse resp, String viewName) throws ServletException, IOException {
		getServletContext()
		.getRequestDispatcher("/view/%s.jsp".formatted(viewName))
		.forward(req, resp);
	}
	
	protected void redirect(HttpServletRequest req, HttpServletResponse resp, String path) throws IOException {
		
		resp.sendRedirect(getServletContext()
							.getContextPath()
							.concat(path));
	}
}
