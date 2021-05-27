package com.pk.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //Use AbstractApplicationContext instead of ApplicationContext
        //to register registerShutdownHook
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/lifecycle/config.xml");
        Samosa samosa =  (Samosa)abstractApplicationContext.getBean("samosa1");
        System.out.println(samosa);

        //registerShutdownHook so that destroy method can be call
        abstractApplicationContext.registerShutdownHook();
    }
}
