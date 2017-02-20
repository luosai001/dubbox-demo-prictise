package com.demo.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Golomee on 2017/02/18.
 */
public class StartProvider {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF.spring/dubbo-demo-provider.xml");
//        applicationContext.start();
//        while (true){
//
//        }
        com.alibaba.dubbo.container.Main.main(args);
    }
}
