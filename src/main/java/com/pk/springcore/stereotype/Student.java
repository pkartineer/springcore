package com.pk.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

//To create bean. by defaul refrence variable name is 'ClassName' in camel format
//@Component

//user  defined reference variable name 'stu'
@Component("stu")
//Each time container send New Object in each call
//By Default is "singleton" in which container send same object in each call
//in Xml <bean class="" name="" Scope="protoype" />
@Scope("prototype")
public class Student {

    @Value("Pawan")
    private String studentName;
    @Value("Jalandhar")
    private String city;

    @Value("#{mobileList}")
    private List<String> contact;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", contact=" + contact +
                '}';
    }

    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
        this.contact = contact;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
