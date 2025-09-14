package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user") // URL: http://localhost:8080/UserFormApp/user
public class UserFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<!doctype html>");
        resp.getWriter().println("<html><head><title>User Form</title></head><body>");
        resp.getWriter().println("<h2>Enter Your Details</h2>");
        resp.getWriter().println("<form method='post' action='user'>");
        resp.getWriter().println("Full Name: <input type='text' name='fullname'><br><br>");
        resp.getWriter().println("Age: <input type='number' name='age'><br><br>");
        resp.getWriter().println("<input type='submit' value='Submit'>");
        resp.getWriter().println("</form>");
        resp.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        String age = req.getParameter("age");

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<!doctype html>");
        resp.getWriter().println("<html><head><title>Result</title></head><body>");
        resp.getWriter().println("<h2>Submitted Data</h2>");
        resp.getWriter().println("<p><b>Full Name:</b> " + fullname + "</p>");
        resp.getWriter().println("<p><b>Age:</b> " + age + "</p>");
        resp.getWriter().println("<a href='user'>Go back</a>");
        resp.getWriter().println("</body></html>");
    }
}
