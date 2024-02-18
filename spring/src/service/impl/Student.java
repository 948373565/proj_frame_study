package service.impl;

import org.springframework.stereotype.Component;
import service.Bitch;

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
}
