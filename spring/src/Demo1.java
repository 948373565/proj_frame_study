import bean.Student;
import config.MyApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 14:29 2023/1/19
 * @Modified By
 */
@ComponentScan
public class Demo1 {
//    HibernateTransactionManager
    public static void main(String[] args) throws IOException {
        //xml方式配置
        System.getProperties().setProperty("xmlname", "94837");
        BeanFactory classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:springbean-${xmlname}.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        //系统环境变量
        Properties properties = System.getProperties();
        String o = properties.getProperty("java.class.path");
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);
        System.out.println(o.split(";")[0]);
        //Spring启动时默认将环境变量装载到StandardEnvironment中
        StandardEnvironment bean = classPathXmlApplicationContext.getBean(StandardEnvironment.class);
        String[] activeProfiles = bean.getActiveProfiles();
        String[] defaultProfiles = bean.getDefaultProfiles();
        //所有环境变量都装在MutablePropertySources中的 private final List<PropertySource<?>> propertySourceList;
        MutablePropertySources propertySources = bean.getPropertySources();
        PropertySource<?> systemProperties1 = propertySources.get("systemProperties");
        System.out.println(systemProperties1);
        Map<String, Object> systemProperties = bean.getSystemProperties();
        //通过ApplicationContext获取BeanFactory
        ApplicationContext applicationContext = MyApplicationContext.getApplicationContext();
        System.out.println(student);
        //资源文件路径
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        Resource resource = defaultResourceLoader.getResource("classpath:database.properties");
        URL url = resource.getURL();
        String path = url.getPath();
        InputStream resourceAsStream = Demo1.class.getClassLoader().getResourceAsStream("database.properties");
        System.out.println(path);
    }
}
