package com.newhand.service.impl;

import com.newhand.dao.BookDao;
import com.newhand.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookServiceImpl
 * @Author hexg8
 * @Date 2024/1/8 15:09
 * @Version 1.0
 * @Description TODO
 **/
@Service
public class BookServiceImpl implements BookService {

    // bookDao
    @Autowired
    private BookDao bookDao;

    Integer number;

    public BookServiceImpl(BookDao bookDao, Integer number) {
        this.bookDao = bookDao;
        this.number = number;
    }
    @Override
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    /**
     * @Author hexg8
     * @Description //TODO 保存
     * @Date 15:09 2024/1/8
     * @Param []
     **/
    @Override
    public void save() {
        bookDao.save();
        System.out.println("book Service Sout");
        System.out.println("number:" + number) ;
    }


}
