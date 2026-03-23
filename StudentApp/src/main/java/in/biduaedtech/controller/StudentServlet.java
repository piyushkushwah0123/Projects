package in.biduaedtech.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import in.biduaedtech.service.RStudentService;
import in.biduaedtech.servicefactory.StudentServiceFactory;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // ✅ LOGIN CHECK
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("login.html");
            return;
        }

        String action = request.getParameter("action");

        RStudentService service = StudentServiceFactory.getStudentService();

        try {

            if ("add".equals(action)) {

                String name = request.getParameter("name");
                Integer age = Integer.parseInt(request.getParameter("age"));
                String address = request.getParameter("address");

                String result = service.addStudent(name, age, address);
                printResponse(response, result, "green");   // ✅ UPDATED
            }

            else if ("search".equals(action)) {

                Integer id = Integer.parseInt(request.getParameter("id"));
                String result = service.searchStudent(id);
                printResponse(response, result, "green");   // ✅ UPDATED
            }

            else if ("update".equals(action)) {

                Integer id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                Integer age = Integer.parseInt(request.getParameter("age"));
                String address = request.getParameter("address");

                String result = service.updateStudent(id, name, age, address);
                printResponse(response, result, "green");   // ✅ UPDATED
            }

            else if ("delete".equals(action)) {

                Integer id = Integer.parseInt(request.getParameter("id"));
                String result = service.deleteStudent(id);
                printResponse(response, result, "green");   // ✅ UPDATED
            }

        } catch (Exception e) {
            printResponse(response, "Error: " + e.getMessage(), "red");  // ✅ UPDATED
        }
    }

    // ✅ NEW METHOD (ADD THIS)
    private void printResponse(HttpServletResponse response, String message, String color)
            throws IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<html><body style='font-family:Arial; background: linear-gradient(to right, #667eea, #764ba2);'>" +

            "<div style='width:400px; margin:150px auto; background:white; padding:30px; border-radius:10px; text-align:center; box-shadow:0px 8px 20px rgba(0,0,0,0.2);'>" +

            "<h2 style='color:" + color + ";'>" + message + "</h2>" +

            "<br><a href='index.html' style='text-decoration:none; color:#667eea;'>⬅ Back to Home</a>" +

            "</div></body></html>"
        );
    }
}