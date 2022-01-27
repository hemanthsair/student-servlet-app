package com.ty.web.city;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Karnataka extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Hit the Karnataka Servlet");
	ServletConfig config =getServletConfig();
	
	String roadTax = config.getInitParameter("RoadTax");
	String rto =config.getInitParameter("RTO");
	
	
	System.out.println("Road tax is "+roadTax);
	System.out.println("RTO is "+rto);
	}
}