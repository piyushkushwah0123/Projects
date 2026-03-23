package in.biduaedtech.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Demo ke liye static save (temporary)
        ServletContext context = getServletContext();
        context.setAttribute("username", username);
        context.setAttribute("password", password);

        response.getWriter().println("Registration Successful! Go to Login.");
    }
}