package com.pk.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/ref/ref_config.xml");
        A a =  (A)applicationContext.getBean("aref");
        System.out.println(a.getA());
        System.out.println(a.getOb().getB());
        System.out.println(a);
    }




}
