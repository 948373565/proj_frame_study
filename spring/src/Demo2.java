import bean.Dog;
import bean.Teacher;
import config.MyStudentFactoryBean;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DefaultLifecycleProcessor;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.Ordered;
import service.UserService;
import service.impl.Student;
import service.impl.UserServiceImpl;

import javax.security.auth.Destroyable;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 20:24 2023/1/21
 * @Modified By
 */
public class Demo2 {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("classpath:springbean-94837.xml");
//        System.out.println(66);
//        Student student = (Student) genericXmlApplicationContext.getBean("myStudentFactoryBean");
//        System.out.println(student);
//        Student student1 = (Student) genericXmlApplicationContext.getBean("myStudentFactoryBean");
//        System.out.println(student1);
//        System.out.println(student == student1);
//        Dog dog = (Dog) genericXmlApplicationContext.getBean("dog");
//        System.out.println(dog.getTeacher());
        UserService userService = (UserService) genericXmlApplicationContext.getBean("useService");
        userService.insert();
        Student stu = (Student)genericXmlApplicationContext.getBean("stu");
        System.out.println(stu);

    }
}
