package com.newhand;

import com.newhand.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }
}