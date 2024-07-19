package edu.ucsy.servlet;

import java.io.IOException;

import edu.ucsy.entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class DataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var product = new Product(1, "Coca Cola", 1000);
		req.setAttribute("product", product);
		getServletContext().getRequestDispatcher("/data.jsp").forward(req, resp);
	}
	
}
