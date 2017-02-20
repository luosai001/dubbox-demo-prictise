package com.demo.dubbo.hello;

/**
 * Created by Golomee on 2017/02/18.
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String message) {
        System.out.println("receive from consumer: "+message);
        return "Hello: "+message;
    }
}
