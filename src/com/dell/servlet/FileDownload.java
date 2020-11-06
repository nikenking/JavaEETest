package com.dell.servlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

public class FileDownload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String downloadFileName = "恩施.pptx";
        ServletContext servletContext = getServletContext();
        servletContext.getMimeType("/static/img/"+downloadFileName);
        response.setContentType(downloadFileName);
        response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(downloadFileName,"UTF-8"));
        BufferedInputStream resourceAsStream = new BufferedInputStream(new FileInputStream("D:\\gitProject\\javaEETest\\web\\static\\img\\" + downloadFileName));
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len = resourceAsStream.read(bytes)) > 0) {
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        resourceAsStream.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
