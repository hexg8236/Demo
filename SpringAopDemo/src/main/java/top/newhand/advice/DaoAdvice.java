package top.newhand.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName DaoAdvice
 * @Author hexg8
 * @Date 2024/1/12 11:33
 * @Version 1.0
 * @Description TODO
 **/
@Component
@Aspect
public class DaoAdvice {

    @Pointcut("execution(void top.newhand.dao.UserDao.save())")
    private void pt() {}

    @Before("pt()")
    public void daoMethod() {
        System.out.println(System.currentTimeMillis());
    }
}
