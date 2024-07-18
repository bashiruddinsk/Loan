package org.example.service;

import org.example.model.Admission;
import org.example.model.Student;

import java.util.UUID;
public class StudentService {
    Admission admission=null;
    public Admission getAdmission(Student bashir)
    {

        if (bashir.age>6){
            admission=new Admission();
            admission.rollNo="AP"+ UUID.randomUUID().toString();
            admission.fee=1000;
            admission.standard=bashir.standard;
        }
        return admission;
    }
}
