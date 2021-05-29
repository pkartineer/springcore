package com.pk.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    //Type wire
    //@Autowired
    private Address address;


    public Emp() {
    }

    //constructor wire
    @Autowired
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
