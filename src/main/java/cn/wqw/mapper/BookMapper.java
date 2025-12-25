package cn.wqw.mapper;

import cn.wqw.pojo.Books;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:
 * @Date: 11:08
 * @Desc:
 */
@Repository
public interface BookMapper {

    /**
     * 查询所有
     * @return
     */
    List<Books> queryAll();
}
