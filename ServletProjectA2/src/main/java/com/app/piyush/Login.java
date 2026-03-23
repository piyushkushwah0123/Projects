package com.app.piyush;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class Login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String age = request.getParameter("age");
		String dept = request.getParameter("dept");

		out.println("<html>");
		out.println("<body style='font-family:Arial;background:#f2f2f2;text-align:center;'>");

		out.println("<h2 style='color:green;'>Employee Submitted Details</h2>");

		out.println("<div style='background:white;width:350px;margin:auto;padding:20px;border-radius:10px;box-shadow:0px 0px 10px gray;'>");

		out.println("<p><b>Name:</b> " + name + "</p>");
		out.println("<p><b>Email:</b> " + email + "</p>");
		out.println("<p><b>City:</b> " + city + "</p>");
		out.println("<p><b>Age:</b> " + age + "</p>");
		out.println("<p><b>Department:</b> " + dept + "</p>");

		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}