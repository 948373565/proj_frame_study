package main.controller;

import main.service.Bitch;
import main.service.Demo1Service;
import main.service.UserService;
import main.service.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import main.service.impl.Student;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 23:58 2023/1/23
 * @Modified By
 */
@Controller
public class Demo1 {
    private int a = 100;

    Demo1() {
        a = 200;
    }

    @Resource
    private Demo1Service demo1Service;

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        BeanFactory context = new AnnotationConfigApplicationContext("main");
        UserService bean = context.getBean(UserService.class);
        bean.insert(100);
//        Demo1Service bean1 = context.getBean(Demo1Service.class);
    }
}

class TargetInterceptor implements MethodInterceptor {
    public <T> T getProxy(Class<T> tClass) {
        //字节码增强
        Enhancer enhancer = new Enhancer();
        //设置父类或者接口
        enhancer.setSuperclass(tClass);
//        enhancer.setInterfaces(Stream.of(tClass).toArray(Class[]::new));
        //设置回调
        enhancer.setCallback(this);
        //创建代理类
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        methodProxy.invoke(o, objects);
        return null;
    }
}