package com.ty.web.city;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Goa extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hit the Karnataka Servlet");
		ServletConfig config =getServletConfig();
		String salesTax = config.getInitParameter("SalesTax");
		System.out.println("Sales tax is "+salesTax);
		}
}