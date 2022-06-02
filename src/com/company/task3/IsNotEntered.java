package com.company.task3;

import com.company.task1.Applicants;

import java.util.List;

public class IsNotEntered {
    public List<String> numberOfNotEntered (List<Applicants> applicants){
          return applicants.stream()
                  .filter(applicant -> applicant.getGrades() < 60)
                  .map(Applicants::getSurname)
                  .toList();
    }
}
