package config;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 15:00 2023/1/19
 * @Modified By
 */
public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("调用了增强器");
        //获取实例的BeanDefinition对象
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("teacher");
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        //更改原本xml中初始化的张三。在实际场景中可以将标识符替换为实际值
        propertyValues.addPropertyValue("name","李四");
    }

}
