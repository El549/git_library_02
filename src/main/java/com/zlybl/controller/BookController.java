package com.zlybl.controller;

import com.zlybl.pojo.Book;
import com.zlybl.service.BookServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //该注解与@Service功能一样 也是在ioc容器中装配bean 同时还标注该类为控制器类
@RequestMapping("/book")
public class BookController {
    @Autowired //自动装配 注入的是接口而不是实现类
    private BookServiceInf bookservice;

    //全查功能
    @RequestMapping("/bookList")
    public ModelAndView selectAll_BookController() {
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        //调用业务逻辑层 经过处理的数据
        List<Book> bookList = bookservice.selectAll_BookServiceInf();
        //查询过后的数据 应该传递到前端 把查询出来的booklist存入到modelAndView对象中 方便前端取值
        mv.addObject("blist", bookList);
        //跳转全查页面
        mv.setViewName("query"); //实质上跳转的是WEB-INF/jsp/query.jsp 因为配置了视图解析器 视图名的前后缀已经配置好
        return mv;
    }

    //根据id将查询的书籍信息显示到页面上便于修改
    @RequestMapping("/showBook")
    public String showBook(int id, Model model){
        //调用service层方法
        Book book = bookservice.selectBookById_BookServiceInf(id);
        //把查询出来的book存入Model对象中  这样我们前端页面可以取值
        model.addAttribute("book",book);
        return "update";
    }
    //在修改页面对信息修改后将其提交到数据库
    @RequestMapping("/updateBook")
    public String updateBook_BookController(Book book){
        return bookservice.updateBook_BookServiceInf(book)>0?"redirect:bookList":"error";
    }

    @RequestMapping("/addBook")
    public ModelAndView addBook_BookController(Book book){
        ModelAndView mv=new ModelAndView();
        int flag=bookservice.addBook_BookServiceInf(book);
        if(flag>0){
            mv.setViewName("redirect:bookList");
        }else {
            mv.setViewName("add");
        }
        return mv;
    }
    
    //删除
    @RequestMapping("/deleteBook")
    public String deleteBook_BookController(int id){
        return bookservice.deleteBook_BookServiceInf(id)>0?"redirect:bookList" : "error";
    }

    //页面通用跳转方法
    @RequestMapping("{page}")
    public String toPage(@PathVariable() String page){
        return page;
    }

}