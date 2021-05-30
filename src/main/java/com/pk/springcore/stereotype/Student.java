package com.pk.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//To create bean. by defaul refrence variable name is 'ClassName' in camel format
//@Component

//user  defined reference variable name 'stu'
@Component("stu")
public class Student {

    @Value("Pawan")
    private String studentName;
    @Value("Jalandhar")
    private String city;



    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
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
