package com.pk.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/pk/springcore/javaconfig/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        //Student student = context.getBean("student", Student.class);

//        //With help of @Bean annotation
//        Student student = context.getBean("getStudent", Student.class);
//        student.helloStudent();


        //With help of @Bean(name = {"stu1", "stu2", "stu3"}) annotation
        Student student = context.getBean("stu2", Student.class);
        student.helloStudent();



    }
}
