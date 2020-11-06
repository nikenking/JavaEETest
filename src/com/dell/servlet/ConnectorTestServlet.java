package com.dell.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConnectorTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//将接收到的字节按照utf-8转码
        String uname = request.getParameter("uname");
        String upass = request.getParameter("upass");
        System.out.printf("uname=%s and upass = %s\n开始转发\n",uname,upass);
        request.getRequestDispatcher("/").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("客户端访问地址:"+request.getRemoteHost());
        System.out.println("客户端访问用户:"+request.getRemoteUser());
        System.out.println("客户端访问路径:"+request.getRemoteAddr());
        System.out.println("客户端访问端口:"+request.getRemotePort());
    }
}
