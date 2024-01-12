package com.newhand.dao.impl;

import com.newhand.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName BookDaoImpl
 * @Author hexg8
 * @Date 2024/1/10 21:06
 * @Version 1.0
 * @Description TODO
 **/
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao Printer");
    }
    @PostConstruct
    public void init() {
        System.out.println("BookService Init Method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("BookService Destroy Method");
    }
}
