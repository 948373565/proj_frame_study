package config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 15:44 2023/1/21
 * @Modified By
 */
public class MyListenner implements ApplicationListener<ContextRefreshedEvent>,InitializingBean{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        System.out.println("小黑棍来罗");
        System.out.println("获取到了Spring的容器");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass()+"：我来调用一下初始化方法");
    }
}
