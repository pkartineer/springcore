package com.pk.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext  applicationContext =  new ClassPathXmlApplicationContext("com/pk/springcore/stereotype/stereotype_config.xml");
        //Student student =  applicationContext.getBean("student", Student.class);
        Student student =  applicationContext.getBean("stu", Student.class);

        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println("==============");
        Student student2 =  applicationContext.getBean("stu", Student.class);
        System.out.println(student2.hashCode());

        System.out.println("======= TEACHER =======");
        Teacher teacher =  applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher.hashCode());
        System.out.println("==============");
        Teacher teacher2 =  applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher2.hashCode());

    }
}
