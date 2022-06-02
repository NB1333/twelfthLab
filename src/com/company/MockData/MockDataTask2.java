package com.company.MockData;

import com.company.task2.Faculty;
import com.company.task2.Student;
import com.company.task2.University;

import java.util.List;

public class MockDataTask2 {
    //Students
    private final Student student1 = new Student("Sobchak", "Ivan",
            "11111", 38.5);
    private final Student student2 = new Student("Nikita", "Bykov",
            "22222", 70.0);
    private final Student student3 = new Student("Ivan", "Ivanov",
            "33333", 65.5);
    private final Student student4 = new Student("Petro", "Petrov",
            "44444", 89);
    private final Student student5 = new Student("Maksym", "Bukasov",
            "55555", 100.0);
    private final Student student6 = new Student("Dmytro", "Yakovlev",
            "66666", 66.6);
    private final List<Student> students = List.of(student1, student2, student3, student4, student5, student6);

    //Faculties
    private final Faculty faculty1 = new Faculty("Information system", List.of(student1, student2, student6));
    private final Faculty faculty2 = new Faculty("Software Engineering", List.of(student3, student4, student5));
    private final List<Faculty> faculties = List.of(faculty1, faculty2);

    //University
    private final University university = new University("KPI", faculties);

    //Getters
    public List<Student> getStudents() {
        return students;
    }

    public List<Faculty> getFaculties(){
        return faculties;
    }

    public University getUniversity(){
        return university;
    }
}
