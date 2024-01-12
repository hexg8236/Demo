package com.newhand.dao.impl;

import com.newhand.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName BookDaoImpl
 * @Author hexg8
 * @Date 2024/1/8 14:51
 * @Version 1.0
 * @Description TODO
 **/
@Component
public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {

    public BookDaoImpl() {
        System.out.println("调用构造参数方法");
    }
    @Override
    public void save() {
        System.out.println("BookDaoImpl输出");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

//    public void init(){
//        System.out.println("init");
//    }
//
//    public void destroy(){
//        System.out.println("destroy");
//    }
}
