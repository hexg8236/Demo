package top.newhand.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
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

    //前置通知 -- 代理方法执行前执行
    //@Before("pt()")
    public void before() {
        System.out.println("UserDao save Before");
    }

    //后置通知 -- 代理方法执行完毕后执行
    //@After("pt()")
    public void after() {
        System.out.println("UserDao save After");
    }

    // 环绕通知 -- 自定义代理方法执行顺序
    // ProceedingJoinPoint 是环绕通知必须得参数不可省略
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("UserDao Around Before");
//        // 执行代理方法，如果没有-代理方法就无法执行
//        proceedingJoinPoint.proceed();
//        System.out.println("UserDao Around After");
//        // 当被代理的方法有返回值时，必须要返回值，如果没有可以返回Object也可以设置void
//        return new Object();
//    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++ ){
            // 执行代理方法，如果没有-代理方法就无法执行
            proceedingJoinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        //获取执行的签名对象
        Signature signature = proceedingJoinPoint.getSignature();
        //获取接口/类全限定名
        String className = signature.getDeclaringTypeName();
        //获取方法名
        String methodName = signature.getName();
        System.out.println("万次执行："+ className+"."+methodName+"-->" +(end-start) + "ms");
        return new Object();
    }

    // 返回后通知 -- 代理方法执行后通知
    //@AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("UserDao AfterReturning");
    }

    // 抛出异常后通知 -- 代理方法执行异常后通知
   //@AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("UserDao AfterThrowing");
    }
}
