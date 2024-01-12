package com.newhand;

import com.newhand.dao.BookDao;
import com.newhand.factory.InstanceBookFactory;

public class Main {

    /**
     * @Author hexg8
     * @Description //TODO
     * @Date 15:03 2024/1/8
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
//        BookDao bookDao = new BookDaoImpl();
//        BookService bookService = new BookServiceImpl();
//        bookService.setBookDao(bookDao);
//        bookService.save();

//        动态工厂实例
        InstanceBookFactory instanceBookFactory = new InstanceBookFactory();
        BookDao bookDao = instanceBookFactory.getBookDao();
        bookDao.save();

    }
}