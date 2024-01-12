package top.newhand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.newhand.bean.Account;
import top.newhand.config.SpringConfig;
import top.newhand.service.AccountService;
import top.newhand.service.impl.AccountServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountServiceImpl.class);
        Account ac = accountService.findById(1);
        System.out.println(ac);
    }
}