package com.demo.dubbo.consumer;

import com.demo.dubbo.hello.HelloService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by Golomee on 2017/02/18.
 */

public class HelloConsumer {

    private static Logger logger = LoggerFactory.getLogger(HelloConsumer.class);
    @Autowired
    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void start() throws InterruptedException {
        while (true){
            String message = "come back hello!";
            String s = helloService.sayHello(message);
            logger.info("response From provider: "+s);
            Thread.sleep(2000);
        }

    }
}
