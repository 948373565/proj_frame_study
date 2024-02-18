package main.service.impl;

import main.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    @Transactional
    public void insert(int a) {
        System.out.printf("执行插入操作" + a);
        throw new RuntimeException("500");
    }
}
