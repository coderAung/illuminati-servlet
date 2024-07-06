package edu.ucsy.illuminati.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// request dispatcher from request object (relative path)
		req.getRequestDispatcher("header").include(req, resp);
		
		// request dispatcher from servlet context (absolute path)
		getServletContext().getRequestDispatcher("/message").include(req, resp);
	
		// servlet name
		getServletContext().getNamedDispatcher("footerServlet").include(req, resp);
	}
}
