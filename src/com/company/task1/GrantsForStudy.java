package com.company.task1;

import java.util.List;

public class GrantsForStudy {
    public List<Applicants> numberOFGrants(List<Applicants> data){

        return data.stream()
                .filter(grade -> grade.getGrades() >= 60)
                .toList();
    }
}
