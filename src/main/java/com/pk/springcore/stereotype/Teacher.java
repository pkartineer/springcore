package com.pk.springcore.stereotype;

import java.util.List;

public class Teacher {

    private String name;
    private List<String> subjects;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

}
