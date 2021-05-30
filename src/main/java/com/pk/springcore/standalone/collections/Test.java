package com.pk.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/pk/springcore/standalone/collections/standalone_collections_config.xml");
        //Person person = (Person)applicationContext.getBean("person1");
        //or
        Person person = applicationContext.getBean("person1", Person.class);
        System.out.println(person);
    }
}
