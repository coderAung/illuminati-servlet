package edu.ucsy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.ucsy.entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Chips", 300));
		products.add(new Product(2, "Coca Cola", 800));
		products.add(new Product(3, "Coconut Bread", 500));
		products.add(new Product(4, "Chess Cake", 1000));
		products.add(new Product(5, "Pizza", 2000));
		
		req.setAttribute("products", products);
		
		getServletContext().getRequestDispatcher("/test.jsp").forward(req, resp);
	}
	
	
}
