package com.piyush;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("uname");
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		String userCity = request.getParameter("ucity");

		String url = "jdbc:mysql://localhost:3306/java100";
		String username = "root";
		String password = "root";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			PreparedStatement pstmt = con
					.prepareStatement("insert into personinformation (uname,email,password,city) values(?,?,?,?)");

			pstmt.setString(1, userName);
			pstmt.setString(2, userEmail);
			pstmt.setString(3, userPassword);
			pstmt.setString(4, userCity);

			int rows = pstmt.executeUpdate();

			if (rows > 0) {
				out.println("<h2>Registration Successful</h2>");
			} else {
				out.println("<h2>Registration Failed</h2>");
			}

			con.close();

		} catch (Exception e) {
			out.println(e);
		}
	}
}