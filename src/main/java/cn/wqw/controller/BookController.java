package cn.wqw.controller;

import cn.wqw.pojo.Books;
import cn.wqw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:
 * @Date: 11:01
 * @Desc:
 */
@Controller
@RequestMapping("book")
public class BookController {

    //注入service层
    @Autowired
    private BookService bookService;

    /**
     * 测试是否连接我们的数据库
     */
    @RequestMapping("queryall")
    @ResponseBody // 把查询的结果响应成json
    public List<Books> queryAll(){
        return this.bookService.queryAll();
    }
}
