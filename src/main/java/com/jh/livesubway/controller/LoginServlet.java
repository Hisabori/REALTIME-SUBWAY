package com.jh.livesubway.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form method=\"post\">");
        out.println("usrName: <input type=\"text\" name=\"usrName\"><br>");
        out.println("password: <input type=\"password\" name=\"password\"><br>");
        out.println("<input type=\"submit\" value=\"login\">");
        out.println("</form>");
        out.println("</body></html>");

        String username = request.getParameter("usrName");
        String password = request.getParameter("password");

        // 여기에서 사용자 인증 등의 처리를 수행합니다.

        response.sendRedirect("login.do");
    }
}
