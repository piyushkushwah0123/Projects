package com.piyush;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	
	   
	
	   public LoginServlet() {
		  System.out.println("Default Constructor");
	}
	 
	   @Override
	public void init() throws ServletException {
		  System.out.println("Init Method Executed......");
	}
	   
	   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       PrintWriter out = resp.getWriter();
	       out.print("<!DOCTYPE html>");
	       out.print("<html>");
	       out.print("<head>");
	       out.print("<title>My Page</title>");
	       out.print("</head>");
	       out.print("<body>");
	       out.print("<h1>Hello Piyush!</h1>");
	       out.print("<p>This page is generated using Servlet PrintWriter.</p>");
	       out.print("</body>");
	       out.print("</html>");
	         	    
	}
	@Override
	public void destroy() {
		
	}
	
}