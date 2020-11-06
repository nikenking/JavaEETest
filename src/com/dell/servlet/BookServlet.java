package com.dell.servlet;

import com.dell.Service.BookService;
import com.dell.Utils.WebUtils;
import com.dell.pojo.Book;
import com.dell.pojo.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends BaseServlet {
    /**
     * 老版查询，不含分页*/
//    public void showPage(HttpServletRequest req, HttpServletResponse res){
//        BookService bookService = new BookService();
//        try {
//            req.setAttribute("bookList", bookService.queryBookList());
//            req.getRequestDispatcher("/bookList.jsp").forward(req,res);
//        } catch (ServletException | IOException e) {
//            e.printStackTrace();
//        }
//    }
    /**
     * 新版查询包含分页*/
    public void showPage(HttpServletRequest req,HttpServletResponse res){
        BookService service = new BookService();
        Page bookPage = WebUtils.copyParaToBean(req.getParameterMap(), new Page());
        req.setAttribute("page",service.queryBookListWithPage(bookPage));
    }
}
