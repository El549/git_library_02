package com.zlybl.service;

import com.zlybl.mapper.BookMapper;
import com.zlybl.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //该注解相当于在ioc容器中进行bean的装配 与@Component注解功能一样 只是标注了为Service层
public class BookServiceImpl implements BookServiceInf{
    @Autowired
    private BookMapper bookMapper;
    /*
    该方法是要实现查询全部书籍 书籍的数据从mapper层获取
    因为mapper层是真正查询数据库的
     */
    @Override
    public List<Book> selectAll_BookServiceInf() {
        List<Book> list = bookMapper.selectAll_BookMapper();
        return list;
    }

    @Override
    public Book selectBookById_BookServiceInf(int id) {
        return bookMapper.selectBookById_BookMapper(id);
    }

    @Override
    public int updateBook_BookServiceInf(Book book) {
        return bookMapper.updateBook_BookMapper(book);
    }

}
