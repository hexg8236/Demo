package com.newhand.factory;

import com.newhand.dao.BookDao;
import com.newhand.dao.impl.BookDaoImpl;

/**
 * @ClassName InstanceBookFactory
 * @Author hexg8
 * @Date 2024/1/8 15:44
 * @Version 1.0
 * @Description TODO 动态工厂
 **/
public class InstanceBookFactory {
    public BookDao getBookDao() {
        System.out.println("BookFactory dao");
        return new BookDaoImpl();
    }
}
