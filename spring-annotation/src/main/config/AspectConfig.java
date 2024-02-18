package main.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy
@Aspect
@Component
//@EnableTransactionManagement
public class AspectConfig {
    @Pointcut("execution(* main.service.impl.*.* (..))")
    public void pointCut() {
        System.out.println("pointCut");
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("在执行方法之前执行");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("pointCut()")
    public void afterReturn() {
        System.out.println("after-return");
    }

    @AfterThrowing("pointCut()")
    public void afterThrow(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(name);
        System.out.println("afterThrow");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        System.out.println(joinPoint.getSignature().getName());
        joinPoint.proceed();
    }
}
