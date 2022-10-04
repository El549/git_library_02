package com.zlybl.mapper;

import com.zlybl.pojo.Book;

import java.util.List;

public interface BookMapper {
    //全查方法
    List<Book> selectAll_BookMapper();

    //删除书籍
    int deleteBook_BookMapper(int id);

    int addBook_BookMapper(Book book);
}
