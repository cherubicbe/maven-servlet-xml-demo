package org.cherubic.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    
    @Override
    protected void doGet (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletRequest.getRequestDispatcher("WEB-INF/pages/hello/index.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
