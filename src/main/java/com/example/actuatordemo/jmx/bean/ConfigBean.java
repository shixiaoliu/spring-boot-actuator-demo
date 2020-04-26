package com.example.actuatordemo.jmx.bean;

import org.springframework.stereotype.Component;

/**
 * @author shiliu
 * @version V1.0
 * @Title: actuator-demo
 * @Package com.example.actuatordemo.jmx.bean
 * @date 2020 年 04 月 26 日
 */
@Component
public class ConfigBean {
    private String id = "123";
    private String name = "test";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
