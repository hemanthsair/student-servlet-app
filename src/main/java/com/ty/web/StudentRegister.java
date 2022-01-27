package com.ty.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentRegister extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//System.out.println("StudentRegister of Servlet ");
		
		String name = req.getParameter("stuName");
		String email = req.getParameter("stuEmail");
		String password = req.getParameter("stuPass");

		
		System.out.println("Student name :"+name);
		System.out.println("student email "+email);
		System.out.println("student password:"+password);
		
	}

}
