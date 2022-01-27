package com.ty.web.dto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.web.dao.Studentdao;

public class CreateStudent extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("------------from createstudent httpservlet---------");
		
		String name = req.getParameter("stuName");
		String email = req.getParameter("stuEmail");
		String password = req.getParameter("stuPass");

		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		
		Studentdao studentdao = new Studentdao();
		studentdao.saveStudent(student); 
		
		
		
		System.out.println("Student name :"+name);
		System.out.println("student email "+email);
		System.out.println("student password:"+password);
		
		PrintWriter printWriter =resp.getWriter();
		String message = name+" details are stored";
		printWriter.print("<html><body><h1>"+message+"</h1></body></html>");
	}

}
