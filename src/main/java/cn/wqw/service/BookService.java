package cn.wqw.service;

import cn.wqw.pojo.Books;

import java.util.List;

/**
 * @Author:
 * @Date: 11:02
 * @Desc:
 */
public interface BookService {
    /**
     * 查询所有
     * @return
     */
    List<Books> queryAll();
}
