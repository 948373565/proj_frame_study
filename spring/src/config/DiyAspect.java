package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

public class DiyAspect {
    public void before() {
        System.out.println("在执行方法之前执行");
    }
    public void after() {
        System.out.println("after");
    }
    public void pointCut(){
        System.out.println("pointCut");
    }
    public void afterReturn(){
        System.out.println("after-return");
    }

    public void afterThrow(){
        System.out.println("afterThrow");
    }
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        System.out.println(joinPoint.getSignature().getName());
        joinPoint.proceed();
    }
}
