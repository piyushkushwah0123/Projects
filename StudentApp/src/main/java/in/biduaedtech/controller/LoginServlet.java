package in.biduaedtech.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    response.sendRedirect("login.html");
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();

        ServletContext context = getServletContext();

        String savedUser = (String) context.getAttribute("username");
        String savedPass = (String) context.getAttribute("password");

    
        if (savedUser == null || savedPass == null) {
            response.getWriter().println("No user found! Please register first.");
            return;
        }

        
        if (username.equals(savedUser) && password.equals(savedPass)) {

            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect("index.html");

        } 
        else {
            response.getWriter().println("Invalid Username or Password");
        }
    }
}