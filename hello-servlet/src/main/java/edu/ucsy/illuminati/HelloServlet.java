package edu.ucsy.illuminati;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns = {"/hello"},
	name = "Hello",
	loadOnStartup = 1,
	initParams = {
			@WebInitParam(name = "email", value = "aung@gmail.com"),
			@WebInitParam(name = "name", value = "Aung Aung"),
			@WebInitParam(name = "age", value = "20")
			
	}
)
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init Method is Working");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = getInitParameter("email");
		String name = getInitParameter("name");
		int age = Integer.parseInt(getInitParameter("age"));
		
		Enumeration<String> initNames = getInitParameterNames();
		while (initNames.hasMoreElements()) {
			System.out.printf("Init Name : %s%n", initNames.nextElement());
		}
		
		System.out.printf("Email : %s%n", email);
		System.out.printf("Name  : %s%n", name);
		System.out.printf("Age   : %d%n", age);
		
		System.out.printf("Servlet Context Name : %s%n", getServletContext().getServletContextName());
		System.out.printf("Servlet Name         : %s%n", getServletName());
		System.out.printf("Context Path         : %s%n", req.getContextPath());
		System.out.printf("Request Path         : %s%n", req.getServletPath());
		
		resp.getWriter().append("Hello Servlet").append("Hi").flush();
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy method is Working");
	}

}
