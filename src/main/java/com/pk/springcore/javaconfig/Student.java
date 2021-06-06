package com.pk.springcore.javaconfig;

//@Component
public class Student {

    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void helloStudent(){
        samosa.displayPrice();
        System.out.println("Hello Students");
    }

}
