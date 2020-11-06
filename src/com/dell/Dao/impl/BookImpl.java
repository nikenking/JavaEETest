package com.dell.Dao.impl;

import com.dell.Dao.BookDao;
import com.dell.Utils.JdbcUtils;
import com.dell.Utils.WebUtils;
import com.dell.pojo.Book;

import java.util.List;

public class BookImpl extends BaseDao implements BookDao {
    @Override
    public Book queryBookById(Integer id) {
        return queryForOne(Book.class,"select * from book where id = ?",id);
    }

    @Override
    public List<Book> queryBookList() {
        return queryForList(Book.class,"select * from book");
    }

    @Override
    public void addBook(Book book) {
        update("insert into book(name,author,price,sales,stock,img_path) values(?,?,?,?,?,?)"
                ,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImg_path());
    }
    @Override
    public void deleteBookById(Integer id) {
        update("delete from book where id = ?",id);
    }

    @Override
    public List<Book> queryBookListPage(Integer currentPage, Integer maxSize) {
        return queryForList(Book.class,"select * from book limit ?, ?",(currentPage-1)*maxSize,maxSize);
    }

    @Override
    public Integer getTotalSize() {
        Number number = (Number) queryForValue("select count(*) from book");
        return  number.intValue();
    }


}
