package com.newhand.factory;

import com.newhand.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName MyBeanFactory
 * @Author hexg8
 * @Date 2024/1/8 15:51
 * @Version 1.0
 * @Description TODO
 **/
public class MyBeanFactory implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        System.out.println("MyBeanFactory BookDao");
        return new BookDaoImpl();
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
