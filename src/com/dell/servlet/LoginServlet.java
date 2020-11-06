package com.dell.servlet;

import com.dell.Utils.WebUtils;
import com.dell.pojo.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

public class LoginServlet extends BaseServlet {
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用了登录方法");
        User user = WebUtils.copyParaToBean(request.getParameterMap(), new User());
        System.out.println(user);
//        request.setAttribute("action","showPage");
        request.getRequestDispatcher("/bookServlet?action=showPage").forward(request,response);
//        response.sendRedirect("http://localhost:8080/Java/bookServlet");
    }
    public void regist(HttpServletRequest request, HttpServletResponse response){
        System.out.println("调用了注册方法，开始跳转");
        try {
            doGet(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/FileOperation.jsp").forward(request,response);
    }
}
