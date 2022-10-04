package com.zlybl.service;

import com.zlybl.pojo.Book;

import java.util.List;

public interface BookServiceInf {
    //全查方法
    List<Book> selectAll_BookServiceInf();
    //查询 回显
    Book selectBookById_BookServiceInf(int id);
    //修改
    int updateBook_BookServiceInf(Book book);
}
