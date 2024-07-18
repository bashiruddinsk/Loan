package org.example.service;

import org.example.model.Address;
import org.example.model.Admission;
import org.example.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentFormTest {

    @Test
    public void ageGreaterThan6()
    {
        Student bashir=new Student();
        bashir.name="Bashir";
        bashir.age=8;
        bashir.standard="10";
        Address bashirAddress=new Address();
        bashirAddress.area="nehruNagar";
        bashirAddress.city="nandigama";
        bashirAddress.flatNo="1-75";
        bashirAddress.street="4th cross";
        bashirAddress.pincode="521182";
        bashir.address=bashirAddress;


        StudentService service=new StudentService();
        Admission admission= service.getAdmission(bashir);
        Assertions.assertEquals(1000,admission.fee);
        Assertions.assertNotNull(admission);


    }

    @Test
    public void ageSmallerThan6()
    {
        Student bashir=new Student();
        bashir.name="Bashir";
        bashir.age=4;
        bashir.standard="10";
        Address bashirAddress=new Address();
        bashirAddress.area="nehruNagar";
        bashirAddress.city="nandigama";
        bashirAddress.flatNo="1-75";
        bashirAddress.street="4th cross";
        bashirAddress.pincode="521182";
        bashir.address=bashirAddress;


        StudentService service=new StudentService();
        Admission admission= service.getAdmission(bashir);
      //  Assertions.assertEquals(1000,admission.fee);
        Assertions.assertNull(admission);


    }
}
