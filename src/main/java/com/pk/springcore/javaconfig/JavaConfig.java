package com.pk.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//Np need if we are using @Bean annotation
//@ComponentScan(basePackages = "com/pk/springcore/javaconfig")
public class JavaConfig {

    //no need then @Component
    //we can use below @Bean annotation. Object name will be as method Name
    //Like below : "getStudent"
//    @Bean
//    public Student getStudent(){
//        return new Student(getSamosa());
//    }


    //we can define also object names in @Bean
    @Bean(name = {"stu1", "stu2", "stu3"})
    public Student getStudent(){
        return new Student(getSamosa());
    }


    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
}
