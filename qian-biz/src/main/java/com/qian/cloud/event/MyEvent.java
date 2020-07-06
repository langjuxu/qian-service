package com.qian.cloud.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author qian
 * @date 2020/7/6
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

}
