package com.zlybl.mapper;

import com.zlybl.pojo.Book;

import java.util.List;

public interface BookMapper {
    //全查方法
    List<Book> selectAll_BookMapper();

    //修改功能
    //根据id查询数据并将其显示
    Book selectBookById_BookMapper(int id);
    //修改
    int updateBook_BookMapper(Book book);
    
    //删除书籍
    int deleteBook_BookMapper(int id);
    //增加书籍
    int addBook_BookMapper(Book book);
    
}