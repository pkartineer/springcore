package com.pk.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    //Type wire
    @Autowired
    //To tell which type of bean should qualify here
    //Qualified bean will inject into bean
    @Qualifier("address2")
    private Address address;


    public Emp() {
    }

    //constructor wire
    //@Autowired
    public Emp(Address address) {
        System.out.println("setting Constructor ...");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setting Address...");
        this.address = address;
    }
}
