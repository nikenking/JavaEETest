package com.dell.pojo;

import java.util.List;

public class Page<T> {
    /**
     * 接口当前页，总数，总页数，显示数量，泛型集合
     * 1 2 3*/
    public static Integer DEFAULT_SIZE = 4;

    private Integer currentPage;

    private Integer maxPage;

    private Integer maxSize;

    private Integer totalSize;

    private List<T> items;


    public Page() {
    }

    public Page(Integer currentPage, Integer maxPage, Integer maxSize, Integer totalSize, List<T> items) {
        this.currentPage = currentPage;
        this.maxPage = maxPage;
        this.maxSize = maxSize;
        this.totalSize = totalSize;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage + "\n"+
                ", maxPage=" + maxPage +"\n"+
                ", maxSize=" + maxSize +"\n"+
                ", totalSize=" + totalSize +"\n"+
                ", items=" + items +
                '}';
    }

    public static Integer getDefaultSize() {
        return DEFAULT_SIZE;
    }

    public static void setDefaultSize(Integer defaultSize) {
        DEFAULT_SIZE = defaultSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }


    public Integer getTotalSize() {
        return totalSize;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
