package com.example._07_servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet is being initialized");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("service() called - HTTP method: "+req.getMethod());

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h2>Service Method Executed</h2>");
        out.println("<p>HTTP Method: "+req.getMethod()+"</p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called - Servlet is being destroyed");
    }
}
