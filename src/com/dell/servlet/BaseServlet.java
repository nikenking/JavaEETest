package com.dell.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public abstract class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("这里是baseservlet,我的子类开始调用我了");
        try {
            String action = request.getParameter("action");
            System.out.println("action is "+action);
            if (action!=null){
                Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
                method.invoke(this,request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
