package com.pk.springcore.constructorinjection;

import com.pk.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/constructorinjection/constructorinjection_config.xml");
        Person person =  (Person)applicationContext.getBean("person");
        System.out.println(person);

    }




}
