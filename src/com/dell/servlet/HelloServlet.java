package com.dell.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setCharacterEncoding("utf-8");//设置服务器字符集为utf-8
//        res.setHeader("Content-Type","text/html;charset=utf-8");//设置响应头，让浏览器使用这种字符集
        res.setContentType("text/html;charset=utf-8");
        System.out.println("i was invisited");
        String method = req.getMethod();
        System.out.println("访问方式是"+method);
        PrintWriter writer = res.getWriter();
        writer.write("访问方式是"+method);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
