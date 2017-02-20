package com.demo.dubbo.consumer;


import com.demo.dubbo.hello.HelloService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Golomee on 2017/02/18.
 */
public class TestHelloConsumer {
    public static void main(String[] args) {
/*        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/dubbo-demo-consumer.xml");
        applicationContext.start();
        HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
        while (true){
           String res = helloService.sayHello("come back");
            System.out.println(res);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/


        com.alibaba.dubbo.container.Main.main(args);
    }

}
