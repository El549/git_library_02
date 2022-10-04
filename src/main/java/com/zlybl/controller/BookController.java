package com.zlybl.controller;

import com.zlybl.pojo.Book;
import com.zlybl.service.BookServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //该注解与@Service功能一样 也是在ioc容器中装配bean 同时还标注该类为控制器类
@RequestMapping("/book")
public class BookController {
    @Autowired //自动装配 注入的是接口而不是实现类
    private BookServiceInf bookservice;

    //全查功能
    @RequestMapping("/lhy/bookList")
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
}