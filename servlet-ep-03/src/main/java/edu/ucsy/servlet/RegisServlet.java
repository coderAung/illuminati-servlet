package edu.ucsy.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regis")
public class RegisServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		System.out.printf("Name : %s%n", name);
		System.out.printf("Age  : %s%n", age);
		
		String path = getServletContext().getContextPath().concat("/success");
		// path = /servlet-ep-03/success
		resp.sendRedirect(path);// relative path
	}
}
