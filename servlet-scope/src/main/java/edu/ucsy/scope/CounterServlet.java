package edu.ucsy.scope;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/count")
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// request scope
		Counter c1 = (Counter) req.getAttribute("counter");
		if (null == c1) {
			c1 = new Counter();
			req.setAttribute("counter", c1);
		}
		c1.countUp();
		
		// session scope
		HttpSession session = req.getSession(true);
		Counter c2 = (Counter) session.getAttribute("counter");
		if (null == c2) {
			c2 = new Counter();
			session.setAttribute("counter", c2);
		}
		c2.countUp();
		
		// application scope
		ServletContext app = getServletContext();
		Counter c3 = (Counter) app.getAttribute("counter");
		if (null == c3) {
			c3 = new Counter();
			app.setAttribute("counter", c3);
		}
		c3.countUp();
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	
	}
}
