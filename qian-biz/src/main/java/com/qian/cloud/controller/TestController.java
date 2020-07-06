package com.qian.cloud.controller;

import com.qian.cloud.event.MyEvent;
import com.qian.cloud.listener.MyListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 添加监听器
        context.addApplicationListener(new MyListener());
        // 上下文启动：包括注册监听器、初始化事件发布器（多播器）...
        context.refresh();
        // 发布事件
        context.publishEvent(new MyEvent("xxxxxxxxxxxxxxxxxxxxxxx"));
    }


}
