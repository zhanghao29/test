package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhanghao
 * @Date Create in 2021/12/10
 * @Version 1.0
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "success . . .";
    }

}
