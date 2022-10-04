package com.zlybl.service;

import com.zlybl.pojo.Book;

import java.util.List;

public interface BookServiceInf {
    //全查方法
    List<Book> selectAll_BookServiceInf();


    int addBook_BookServiceInf(Book book);
    //删除

    int deleteBook_BookServiceInf(int id);


}
