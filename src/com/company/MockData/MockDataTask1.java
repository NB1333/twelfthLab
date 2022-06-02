package com.company.MockData;

import com.company.task1.Applicants;

import java.util.List;

public class MockDataTask1 {
    //Applicants
    private final Applicants applicants1 = new Applicants("Sobchak", 65);
    private final Applicants applicants2 = new Applicants("Bykov", 87);
    private final Applicants applicants3 = new Applicants("Ivanov", 55);
    private final Applicants applicants4 = new Applicants("Petrov", 43);
    private final Applicants applicants5 = new Applicants("Bukasov", 100);
    private final Applicants applicants6 = new Applicants("Yakovlev", 66);

    private final List<Applicants> listOfApplicants = List.of(applicants1, applicants2,
            applicants3, applicants4, applicants5, applicants6);

    //Getter
    public List<Applicants> getListOfApplicants() {
        return listOfApplicants;
    }
}

