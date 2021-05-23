package com.pk.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Pawan!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student3);
        Student student4 = (Student) context.getBean("student4");
        System.out.println(student4);


    }
}
