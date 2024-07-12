package edu.ucsy.scope;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/count")
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// request scope
		var c1 = (Counter) req.getAttribute("counter");
		if (null == c1) {
			c1 = new Counter();
			req.setAttribute("counter", c1);
		}
		c1.countUp();
		
		// session scope
		var session = req.getSession(true);
		var c2 = (Counter) session.getAttribute("counter");
		if (null == c2) {
			c2 = new Counter();
			session.setAttribute("counter", c2);
		}
		c2.countUp();
		
		// application scope
		var app = getServletContext();
		var c3 = (Counter) app.getAttribute("counter");
		if (null == c3) {
			c3 = new Counter();
			app.setAttribute("counter", c3);
		}
		c3.countUp();
		
		getServletContext().getRequestDispatcher("/").forward(req, resp);
	}
}
