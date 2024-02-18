package config;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 20:11 2023/1/23
 * @Modified By
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void initPropertySources() {
        StandardEnvironment environment;
        ConfigurableEnvironment environment1 = getEnvironment();
        if (environment1 instanceof StandardEnvironment) {
            environment = (StandardEnvironment) environment1;
        }
    }
}
