package com.newhand.factory;

import com.newhand.dao.BookDao;
import com.newhand.dao.impl.BookDaoImpl;

/**
 * @ClassName StaticBookFactory
 * @Author hexg8
 * @Date 2024/1/8 15:41
 * @Version 1.0
 * @Description TODO 静态对象工厂方法
 **/
public class StaticBookFactory {
    public static BookDao getBookDao() {
        System.out.println("StaticBookFactory dao");
        return new BookDaoImpl();
    }
}
