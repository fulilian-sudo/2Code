package cn.wqw.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Books)实体类
 *
 * @author makejava
 * @since 2025-12-22 10:57:40
 */
@Data
public class Books implements Serializable {
    private static final long serialVersionUID = 448590515551723102L;
    /**
     * 书id
     */
    private Integer bookid;
    /**
     * 书名
     */
    private String bookname;
    /**
     * 数量
     */
    private Integer bookcounts;
    /**
     * 描述
     */
    private String detail;



}

