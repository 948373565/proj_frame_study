package service.impl;

import org.springframework.stereotype.Component;
import service.UserService;

@Component
public class UserServiceImpl  implements UserService {
    @Override
    public void insert() {
        System.out.println("执行插入操作");
        throw new IndexOutOfBoundsException();
    }
}
