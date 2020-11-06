package com.dell.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUpload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
            List<FileItem> list = fileUpload.parseRequest(request);
            for (FileItem fileItem : list) {
                if (fileItem.isFormField()){
                    System.out.println("name="+fileItem.getFieldName());
                    System.out.println("value="+fileItem.getString("UTF-8"));
                }else {
                    System.out.println("name="+fileItem.getFieldName());
                    System.out.println("file name="+fileItem.getName());
                    fileItem.write(new File("d:\\"+fileItem.getName()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
