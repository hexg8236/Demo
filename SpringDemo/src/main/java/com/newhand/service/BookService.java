package com.newhand.service;

import com.newhand.dao.BookDao;

/**
 * @ClassName BookService
 * @Author hexg8
 * @Date 2024/1/8 15:09
 * @Version 1.0
 * @Description TODO
 **/
public interface BookService {

    /**
     * @Author hexg8
     * @Description //TODO 注入bookDao
     * @Date 15:19 2024/1/8
     * @Param [bookDao]
     * @return void
     **/
    void setBookDao(BookDao bookDao);
    /**
     * @Author hexg8
     * @Description 保存
     * @Date 15:13 2024/1/8
     * @Param []
     * @return void
     **/
    void save();

}
