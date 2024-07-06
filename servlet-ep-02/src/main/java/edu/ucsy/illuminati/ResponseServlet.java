package edu.ucsy.illuminati;

import java.io.IOException;
import java.io.PrintWriter;

import edu.ucsy.illuminati.data.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		User[] users = { new User(1, "Aung Aung"), new User(2, "Thidar"), new User(3, "Su Su"),
				new User(4, "Kyaw Kyaw") };

		out.append("<!DOCTYPE html>");
		out.append("<html>");
		out.append("<head>");
		out.append("<title>Response Test</title>");
		out.append("</head>");
		out.append("<body>");
		out.append("<h1>Hello Response Servlet</h1>	");
		out.append("<table>");
		out.append("<tr>");
		out.append("<th>ID</th>");
		out.append("<th>Name</th>");
		out.append("</tr>");

		for (User u : users) {
			out.append("<tr>");
			out.append("<td>%d</td>".formatted(u.getId()));
			out.append("<td>%s</td>".formatted(u.getName()));
			out.append("</tr>");

		}

		out.append("</table>");
		out.append("</body>");
		out.append("</html>");
		out.flush();

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		out.append("<!DOCTYPE html>");
		out.append("<html>");
		out.append("<head>");
		out.append("</head>");
		out.append("<body>");
		out.append("<table>");
		out.append("<tr>");
		out.append("<th>Name</th>");
		out.append("<td>:</td>");
		out.append("<td>%s</td>".formatted(name));
		out.append("</tr>");
		out.append("<tr>");
		out.append("<th>Password</th>");
		out.append("<td>:</td>");
		out.append("<td>%s</td>".formatted(password));
		out.append("</tr>");
		out.append("</table>");
		out.append("</body>");
		out.append("</html>");
		out.flush();
	}
}
