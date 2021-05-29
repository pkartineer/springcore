package com.pk.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;


    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    //PostConstruct, PreDestroy are part of less than <= Java8
    //for >= java9 we are using maven javax.annotation-api
    @PostConstruct
    public void init(){
        System.out.println("Inside Init method");
    }


    @PreDestroy
    public void destroy(){
        System.out.println("Inside destroy method");
    }


}
