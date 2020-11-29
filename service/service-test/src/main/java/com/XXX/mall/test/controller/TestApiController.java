package com.XXX.mall.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 123
 * @author: cabbage
 * @create: 2020-11-28 11:21
 */
@RestController
@RequestMapping("/api/test")
public class TestApiController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
