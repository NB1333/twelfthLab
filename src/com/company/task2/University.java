package com.company.task2;

import java.util.List;

public class University {
    private final String name;
    private List<Faculty> faculties;

    public University(String name, List<Faculty> faculties){
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
