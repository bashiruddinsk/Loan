package org.example;

import org.example.model.Address;
import org.example.model.Admission;
import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.Test;

import java.security.Provider;

public class StudentFormTest {

    @Test
    public void test()
    {
        Student bashir=new Student();
        bashir.name="Bashir";
        bashir.age=16;
        bashir.standard="10";
        Address bashirAddress=new Address();
        bashirAddress.area="nehruNagar";
        bashirAddress.city="nandigama";
        bashirAddress.flatNo="1-75";
        bashirAddress.street="4th cross";
        bashirAddress.pincode="521182";
        bashir.address=bashirAddress;

        Admission admission=new Admission();
        StudentService service=new StudentService();
       bashir.admission= service.getAdmission(bashir);



    }
}
