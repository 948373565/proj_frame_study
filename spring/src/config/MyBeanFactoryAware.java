package config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 11:39 2023/1/22
 * @Modified By
 */
public class MyBeanFactoryAware implements BeanFactoryAware {
    private static BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public static BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
