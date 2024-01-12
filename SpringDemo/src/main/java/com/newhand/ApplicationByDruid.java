package com.newhand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ApplicationByDruid
 * @Author hexg8
 * @Date 2024/1/10 11:35
 * @Version 1.0
 * @Description TODO
 **/
public class ApplicationByDruid {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springDruidConfig.xml");
        // 从容器中获取druid DataSource对象
        Object dataSource = ctx.getBean("dataSource");
        System.out.println(dataSource);
        // 从容器中获取C3PODataSource 对象
        Object dataSource1 = ctx.getBean("c3poDataSource");
        System.out.println(dataSource1);
    }
}
