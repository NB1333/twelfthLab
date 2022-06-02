package com.company.task2;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BestStudents {
    public List<Student> rating(List<Student> students){
         OptionalDouble averageUniversityGrade = students.stream()
                 .mapToDouble(Student::getAverageGrade)
                 .average();

         return students.stream()
                 .filter(student -> student.getAverageGrade() > averageUniversityGrade.getAsDouble())
                 .collect(Collectors.toList());
    }
}
