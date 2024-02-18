package main.service.impl;

import main.service.Bitch;
import org.springframework.stereotype.Component;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 23:59 2023/1/23
 * @Modified By
 */
@Component
public class Student implements Bitch {
    private int age = 12;
    private String name = "张三";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void m01() {

    }
}
