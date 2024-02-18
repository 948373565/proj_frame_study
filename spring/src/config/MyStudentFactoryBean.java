package config;

import bean.Student;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 13:40 2023/1/22
 * @Modified By
 */
public class MyStudentFactoryBean implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        Student student = new Student(null,null);
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
