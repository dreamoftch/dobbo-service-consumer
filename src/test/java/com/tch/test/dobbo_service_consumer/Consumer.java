package com.tch.test.dobbo_service_consumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tch.test.dubbo_service_model.service.DemoService;

public class Consumer {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});

        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理

        String hello = demoService.sayHello(" dreamoftch "); // 执行远程方法


        System.out.println( hello ); // 显示调用结果

    }

 

}
