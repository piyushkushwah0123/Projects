package in.biduaedtech.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/forgot")
public class ForgotServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        // Static logic (demo)
        if ("admin".equals(username)) {
            response.getWriter().println("Your password is: 1234");
        } else {
            response.getWriter().println("User not found!");
        }
    }
}