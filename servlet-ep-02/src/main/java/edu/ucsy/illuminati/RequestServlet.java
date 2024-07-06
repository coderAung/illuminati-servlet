package edu.ucsy.illuminati;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class RequestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		int age = Integer.parseInt(req.getParameter("age"));
		
		System.out.printf("Email : %s%n", email);
		System.out.printf("Phone : %s%n", phone);
		System.out.printf("Age   : %s%n", age);
		
		Enumeration<String> paramNames = req.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			System.out.printf("%-5s: %s%n", name, req.getParameter(name));
		}
		
		// email, phone, age
		
		resp.getWriter().append("Hello Request Servlet").flush();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.printf("Name     : %s%n", name);
		System.out.printf("Password : %s%n", password);
	}

}
