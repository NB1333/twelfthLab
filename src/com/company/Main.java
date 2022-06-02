package com.company;

import com.company.MockData.MockDataTask1;
import com.company.MockData.MockDataTask2;
import com.company.task1.Applicants;
import com.company.task1.GrantsForStudy;
import com.company.task2.BestStudents;
import com.company.task2.Student;
import com.company.task3.IsNotEntered;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Task1
	    MockDataTask1 dataApplicants = new MockDataTask1();
        GrantsForStudy grantsForStudy = new GrantsForStudy();

        List<Applicants> grants = grantsForStudy.numberOFGrants(dataApplicants.getListOfApplicants());

        System.out.println("-----Task 1-----");
        grants.forEach(System.out::println);

        //Task2
        MockDataTask2 dataUniversity = new MockDataTask2();
        BestStudents bestStudents = new BestStudents();

        List<Student> students = bestStudents.rating(dataUniversity.getStudents());

        System.out.println("-----Task 2-----");
        students.forEach(System.out::println);

        //Task3
        IsNotEntered isNotEntered = new IsNotEntered();

        List<String> applicants = isNotEntered.numberOfNotEntered(dataApplicants.getListOfApplicants());

        System.out.println("------Task 3-----");
        applicants.forEach(System.out::println);
    }
}
