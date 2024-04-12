package top.newhand.springredisdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hexg8236
 * @className SrpingRedisDemo
 * @Since 2024/4/12 17:55
 * @description 启动类
 **/

public class SpringRedisDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRedisDemo.class);
    }
}
