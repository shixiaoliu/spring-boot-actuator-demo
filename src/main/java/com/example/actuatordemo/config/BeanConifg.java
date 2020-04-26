package com.example.actuatordemo.config;

import com.example.actuatordemo.jmx.bean.ConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.support.MBeanServerFactoryBean;

import javax.management.MBeanServer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shiliu
 * @version V1.0
 * @Title: actuator-demo
 * @Package com.example.actuatordemo.config
 * @date 2020 年 04 月 26 日
 */
@Configuration
public class BeanConifg {
    @Bean
    public MBeanExporter mBeanExporter(ConfigBean configBean, MBeanServer mBeanServer) {
        MBeanExporter mBeanExporter = new MBeanExporter();
        mBeanExporter.setServer(mBeanServer);
        Map<String, Object> beans = new HashMap<>();
        //com.sun.someapp:type=Whatsit,name=25
        beans.put("bean:name=configBean", configBean);
        mBeanExporter.setBeans(beans);
        return mBeanExporter;
    }

//    @Bean
//    public MBeanServerFactoryBean mBeanServerFactoryBean() {
//        return new MBeanServerFactoryBean();
//    }
}
