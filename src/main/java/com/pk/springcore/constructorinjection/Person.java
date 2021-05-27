package com.pk.springcore.constructorinjection;

public class Person {
    private String name;
    private int personid;
    private Certi ocerti;


    public Person(String name, int personid, Certi ocerti) {
        this.name = name;
        this.personid = personid;
        this.ocerti = ocerti;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                ", ocerti=" + ocerti +
                '}';
    }

    //    public Person(String name, int personid, Cer) {
//        this.name = name;
//        this.personid = personid;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", personid=" + personid +
//                '}';
//    }
}
