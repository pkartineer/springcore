package com.pk.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/autowire/annotation/autowire_config.xml");
        Emp emp = (Emp)applicationContext.getBean("emp");
        System.out.println(emp);

    }
}
