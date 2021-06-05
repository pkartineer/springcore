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

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                '}';
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
