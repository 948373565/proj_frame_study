package bean;

import org.springframework.context.annotation.Bean;

/**
 * @Title:
 * @Author:ZhangJing
 * @Description:TODO
 * @Date:Created in 15:26 2023/1/19
 * @Modified By
 */
public class Teacher {
    private String name;
    private Integer age;
    private Student student;

    public Teacher(String name, Integer age, Student student) {
        this.name = name;
        this.age = age;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Teacher() {
        System.out.println("调用了teacher的无参构造方法");
    }

    public void init() {
        System.out.println(3333);
    }
}
