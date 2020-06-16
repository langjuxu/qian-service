package com.qian.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qian
 * @date 2020/6/12
 */
@RestController
@RefreshScope
@RequestMapping("/test")
public class TestController {

    @Value("${little.fairy}")
    private String testParam;

    @GetMapping("/getTest")
    public String getTest() {
        System.err.println(testParam);
        return testParam;
    }

}
