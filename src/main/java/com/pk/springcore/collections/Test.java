package com.pk.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/collections/collection_config.xml");
        Employee employee = (Employee)applicationContext.getBean("emp");
        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getPhones());
        System.out.println(employee.getAddress());
        System.out.println(employee.getPhones());
        System.out.println(employee.getCourses().getClass());
    }
}
