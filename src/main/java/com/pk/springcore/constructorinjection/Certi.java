package com.pk.springcore.constructorinjection;

public class Certi {
    private String name;

    public Certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }
}
