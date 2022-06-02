package com.company.task2;

import java.util.List;

public class Faculty {
    private String name;
    private List<Student> student;

    public Faculty (String name, List<Student> student){
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudents(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + student +
                '}';
    }
}
