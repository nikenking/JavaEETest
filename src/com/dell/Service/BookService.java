package com.dell.Service;

import com.dell.Dao.BookDao;
import com.dell.Dao.impl.BookImpl;
import com.dell.pojo.Book;
import com.dell.pojo.Page;

import java.util.List;

public class BookService {
    BookDao book = new BookImpl();
    public  List<Book> queryBookList(){
        return book.queryBookList();
    }
    /**
     * 通过当前页计算查询起点
     * 通过最大长度计算查询总数
     * 通过总数计算最大页*/
    public Page queryBookListWithPage(Page page){//传入一个参数：currentPage当前页码
        if (page.getMaxSize()==null)page.setMaxSize(Page.DEFAULT_SIZE);
        //总数-不用于显示
        page.setTotalSize(book.getTotalSize());
        //最大页数
        page.setMaxPage(page.getTotalSize()/page.getMaxSize());
        if (page.getTotalSize()%page.getMaxSize()!=0){
            page.setMaxPage(page.getMaxPage()+1);
        }
        //当前页位置
        if (page.getCurrentPage()<1){
            page.setCurrentPage(1);
        }else if (page.getCurrentPage()>page.getMaxPage()){
            page.setCurrentPage(page.getMaxPage());
        }else page.setCurrentPage(page.getCurrentPage());
        //当各个参数合法，开始查询指定范围的数据传入page
        page.setItems(book.queryBookListPage(page.getCurrentPage(), page.getMaxSize()));
        return page;
    }
}
