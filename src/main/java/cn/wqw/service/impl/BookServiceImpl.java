package cn.wqw.service.impl;

import cn.wqw.pojo.Books;
import cn.wqw.mapper.BookMapper;
import cn.wqw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Date: 11:06
 * @Desc:
 */
@Service
public class BookServiceImpl implements BookService {

    //注入mapper(dao)层
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Books> queryAll() {
        return this.bookMapper.queryAll();
    }
}
