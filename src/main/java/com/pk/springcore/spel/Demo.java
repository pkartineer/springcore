package com.pk.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//making object of Demo. We get this in runtime
@Component
public class Demo {

    @Value("#{11+22}")
    private int x;

    @Value("#{323+2323+2323+232}")
    private int y;

    //calling static method
    @Value("#{T(java.lang.Math).sqrt(625)}")
    private int z;

    //calling static variable
    @Value("#{T(java.lang.Math).PI}")
    private double d;

    //Calling constructor. You can call any of class constructor like this
    @Value("#{ new java.lang.String('Pawan Kumar')}")
    private String name;


    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
