package com.piyush;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletProjectJavaA2")
public class ServletProjectJavaA2 extends HttpServlet {
	static {

		System.out.println("Servlet Loading .........");
	}
		@Override
		public void init() throws ServletException {
		System.out.println("Servlet Instantiated");
		}
		@Override
		public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		}
		@Override
		public void destroy() {

}
	}