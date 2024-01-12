package com.newhand;

import com.newhand.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Application
 * @Author hexg8
 * @Date 2024/1/8 15:11
 * @Version 1.0
 * @Description TODO
 **/
public class ApplicationByXml {
    public static void main(String[] args) {
        // 创建BookDao对象，并通过配置将对象注入到Spring的容器中
        // 初始化容器 调用对象构造函数
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
        // 获取对象并调用
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

//        ResourceService resourceService = (ResourceService) ctx.getBean("resourceService");
//        System.out.println(resourceService.toString());

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        ctx.registerShutdownHook();
    }
}
