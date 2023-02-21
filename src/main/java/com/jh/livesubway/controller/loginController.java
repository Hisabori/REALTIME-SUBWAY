package com.jh.livesubway.controller;


import com.jh.livesubway.controller.dto.MemberDto;
import jakarta.servlet.annotation.WebServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class loginController extends HttpServlet {



        private static final long serialVersionUID = 1L;

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            RequestDispatcher RD=req.getRequestDispatcher("/WEB-INF/login.jsq");
            RD.forward(req,resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");
            String userName = req.getParameter("id");
            String userPwd = req.getParameter("password");
            String name = req.getParameter("name");
            String email = req.getParameter("email");

            MemberDto m_dto = MemberDto.getInstance();
            m_dto.setUserName(userName);
            m_dto.setUserPassword(userPwd);
        }
    }

