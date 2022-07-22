package com.example.resourcesserver.controller;

import com.example.resourcesserver.config.Result;
import com.example.resourcesserver.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhuyuhua
 * @Date: 2022/7/21 15:07
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/testString")
    public Result<String> test(@RequestParam("request") String request) {
        return testService.test(request);
    }

    @GetMapping("/testString2")
    public Result<String> test2(@RequestParam("request") String request) {
        return testService.test(request);
    }
}
