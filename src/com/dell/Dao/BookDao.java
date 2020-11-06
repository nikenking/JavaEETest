package com.dell.Dao;

import com.dell.pojo.Book;

import java.util.List;

public interface BookDao {
    public Book queryBookById(Integer id);
    public List<Book> queryBookList();
    public void addBook(Book book);
    public void deleteBookById(Integer id);
    public List<Book> queryBookListPage(Integer currentPage,Integer maxSize);
    public Integer getTotalSize();
}
