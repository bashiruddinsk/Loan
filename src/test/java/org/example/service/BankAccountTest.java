package org.example.service;

import org.example.bank.Account;
import org.example.bank.BankForm;
import org.example.model.Address;
import org.example.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BankAccountTest {

    @Test
    public void ageGreaterThan18(){
        BankForm bankForm=new BankForm();
        bankForm.accountHolderName="Shaik Bashiruddin";
        bankForm.age=19;
        bankForm.aadharNumber=834020350065L;
        bankForm.emailId="bashiruddin.sk4664@gmail.com";
        bankForm.mobileNumber=9611578479L;

        Address bashirAddress=new Address();
        bashirAddress.area="nehruNagar";
        bashirAddress.city="nandigama";
        bashirAddress.flatNo="1-75";
        bashirAddress.street="4th cross";
        bashirAddress.pincode="521182";
        bankForm.userAddress=bashirAddress;

        BankService service=new BankService();
        Account bashirAccount =service.createAccount(bankForm);
        service.deposit(5000);
       // Assertions.assertEquals(5000,bashirAccount.balance);
        Assertions.assertNotNull(bashirAccount);

    }
    @Test
    public void ageSmallerThan18(){
        BankForm bankForm=new BankForm();
        bankForm.accountHolderName="Shaik Bashiruddin";
        bankForm.age=17;
        bankForm.aadharNumber=834020350065L;
        bankForm.emailId="bashiruddin.sk4664@gmail.com";
        bankForm.mobileNumber=9611578479L;
        Address bashirAddress=new Address();
        bashirAddress.area="nehruNagar";
        bashirAddress.city="nandigama";
        bashirAddress.flatNo="1-75";
        bashirAddress.street="4th cross";
        bashirAddress.pincode="521182";
        bankForm.userAddress=bashirAddress;

        BankService service=new BankService();
        Account bashirAccount =service.createAccount(bankForm);
        service.deposit(5000);

        Assertions.assertNull(bashirAccount);
    }
    @Test
    public void demo1()
    {
        List<Student> studentList=new ArrayList<>();
        Student student1=new Student();
        student1.name="abc";
        student1.standard="10th";
        student1.age=15;
        Student student2=new Student();
        student2.name="def";
        student2.standard="7th";
        student2.age=12;
        Student student3=new Student();
        student3.name="ghi";
        student3.standard="6th";
        student3.age=10;
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList.get(1));
        System.out.println(student2);
    }
}


