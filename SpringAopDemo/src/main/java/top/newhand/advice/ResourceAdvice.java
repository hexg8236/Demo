package top.newhand.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ResourceAdvice
 * @Author hexg8
 * @Date 2024/1/12 21:24
 * @Version 1.0
 * @Description TODO
 **/
@Component
@Aspect
public class ResourceAdvice {
    @Pointcut("execution(boolean top.newhand.service.*Service.*(*,*))")
    public void servicePt(){
    }
    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            //判断参数是不是字符串
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        return proceedingJoinPoint.proceed(args);
    }

}
