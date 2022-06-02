package com.company.task2;

public class Student {
    private String name;
    private String surname;
    private String recordBook;
    private double averageGrade;

    public Student(String name, String surname, String recordBook, double averageGrade){
        this.name = name;
        this.surname = surname;
        this.recordBook = recordBook;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(String recordBook) {
        this.recordBook = recordBook;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", recordBook='" + recordBook + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
