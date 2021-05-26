package com.pk.springcore.ref;

public class B {
    private int b;
    private B oa;

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", oa=" + oa +
                '}';
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public B getOa() {
        return oa;
    }

    public void setOa(B oa) {
        this.oa = oa;
    }


}
