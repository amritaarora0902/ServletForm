
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to Register Servlet</h2>");
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String user_gender = request.getParameter("user_gender");
        String course = request.getParameter("course");
        
        out.println("<h2> First Name: "  + fname + "</h2>");
        out.println("<h2> Last Name: "  + lname + "</h2>");
        out.println("<h2> Gender: "  + user_gender + "</h2>");
        out.println("<h2> Course: "  + course + "</h2>");
    }
}
