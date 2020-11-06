package com.dell.test;
import com.dell.Dao.impl.BookImpl;
import com.dell.Service.BookService;
import com.dell.pojo.Book;
import com.dell.pojo.Page;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JustTest {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Page page = new Page<>();
        page.setCurrentPage(100);
        Page bookPage = bookService.queryBookListWithPage(page);
        System.out.println(bookPage);
    }
}
