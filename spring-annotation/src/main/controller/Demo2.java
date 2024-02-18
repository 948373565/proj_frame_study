package main.controller;

import main.service.Demo1Service;
import org.springframework.stereotype.Controller;

@Controller
public class Demo2 {
    private Demo1Service service;

    public Demo2(Demo1Service service) {
        this.service = service;
    }
}
