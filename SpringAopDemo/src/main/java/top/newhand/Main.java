package top.newhand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.newhand.config.SpringConfig;
import top.newhand.service.ResourceService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserDao bookDao = ctx.getBean(UserDao.class);
//        bookDao.save();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourcesService = ctx.getBean(ResourceService.class);
        boolean flag = resourcesService.openURL("http://pan.baidu.com/haha", "root ");
        System.out.println(flag);
    }
}