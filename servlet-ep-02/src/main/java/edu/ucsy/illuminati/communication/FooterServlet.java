package edu.ucsy.illuminati.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
	urlPatterns = {"/footer"},
	name = "footerServlet"
)
public class FooterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String footer = "This is Footer";
		
		resp.getWriter().append("<h3>%s</h3>".formatted(footer)).flush();
	}
}
