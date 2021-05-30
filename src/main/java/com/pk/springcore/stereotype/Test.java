package com.pk.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext  applicationContext =  new ClassPathXmlApplicationContext("com/pk/springcore/stereotype/stereotype_config.xml");
        //Student student =  applicationContext.getBean("student", Student.class);
        Student student =  applicationContext.getBean("stu", Student.class);

        System.out.println(student);
    }
}
