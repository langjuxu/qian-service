package com.qian.cloud.listener;

import com.qian.cloud.event.MyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author qian
 * @date 2020/7/6
 */
public class MyListener implements ApplicationListener<MyEvent> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(MyEvent event) {
        Object source = event.getSource();
        System.err.println(source);
    }
}
