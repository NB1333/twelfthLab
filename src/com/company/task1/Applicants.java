package com.company.task1;

public class Applicants {
    private String surname;
    private double grade;

    public Applicants(String surname, double grade) {
        this.surname = surname;
        this.grade = grade;
    }

    public double getGrades() {
        return grade;
    }

    public void setGrades(double grades) {
        this.grade = grades;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Enrollee{" +
                "surname='" + surname + '\'' +
                ", grades=" + grade +
                '}';
    }
}
