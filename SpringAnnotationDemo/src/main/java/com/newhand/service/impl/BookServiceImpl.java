package com.newhand.service.impl;

import com.newhand.dao.BookDao;
import com.newhand.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @ClassName BookServiceImpl
 * @Author hexg8
 * @Date 2024/1/10 21:14
 * @Version 1.0
 * @Description TODO
 **/
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void save() {
        bookDao.save();
        System.out.println("BookService Printer");
    }
}
