package org.example.neoteric;

import org.example.neoteric.model.CourseJoinDetails;
import org.example.neoteric.model.NeotericTechnologies;
import org.example.neoteric.model.Register;
import org.example.neoteric.service.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NeotericTest {

    @Test
    public void isSignup() {

        NeotericTechnologies neotericTechnologies = new NeotericTechnologies();
        Register register = new Register();
        register.firstName = "PYDI";
        register.lastName = "TARUN";
        register.email = "tharunbabu565@gmail.com";
        register.mobileNo = "9848243416";
        register.createPassword = "Tharun@123";
        register.confirmPassword = "Tharun@123";
        neotericTechnologies.register = register;
        SubmitDetails submitDetails=new SubmitDetails();
        neotericTechnologies=submitDetails.submit(neotericTechnologies);
        System.out.println(neotericTechnologies.register.isSignup);
    }
    @Test
    public void neotericLogin()
    {
        NeotericTechnologies neotericTechnologies = new NeotericTechnologies();
        Register register = new Register();
        register.firstName = "PYDI";
        register.lastName = "TARUN";
        register.email = "tharunbabu565@gmail.com";
        register.mobileNo = "9848243416";
        register.createPassword = "Tharun@123";
        register.confirmPassword = "Tharun@123";
        neotericTechnologies.register = register;
        SubmitDetails submitDetails=new SubmitDetails();
        neotericTechnologies=submitDetails.submit(neotericTechnologies);
        LoginDetails loginDetails=new LoginDetails();
        neotericTechnologies=loginDetails.getLogin(neotericTechnologies,"tharunbabu565@gmail.com","Tharun@123");

        Assertions.assertTrue(neotericTechnologies.login.isLogin);
    }
    @Test
    public  void listOfCourses()
    {
        NeotericTechnologies neotericTechnologies = new NeotericTechnologies();
        Register register = new Register();
        register.firstName = "PYDI";
        register.lastName = "TARUN";
        register.email = "tharunbabu565@gmail.com";
        register.mobileNo = "9848243416";
        register.createPassword = "Tharun@123";
        register.confirmPassword = "Tharun@123";
        neotericTechnologies.register = register;
        SubmitDetails submitDetails=new SubmitDetails();
        neotericTechnologies=submitDetails.submit(neotericTechnologies);
        LoginDetails loginDetails=new LoginDetails();
        neotericTechnologies=loginDetails.getLogin(neotericTechnologies,"tharunbabu565@gmail.com","Tharun@123");
        ViewListOfCourses listOfCourse=new ViewListOfCourses();
        neotericTechnologies=listOfCourse.listOfCourses(neotericTechnologies);
        Assertions.assertNotNull(neotericTechnologies.courseList);

    }
    @Test
    public void selectCourse()
    {
        NeotericTechnologies neotericTechnologies = new NeotericTechnologies();
        Register register = new Register();
        register.firstName = "PYDI";
        register.lastName = "TARUN";
        register.email = "tharunbabu565@gmail.com";
        register.mobileNo = "9848243416";
        register.createPassword = "Tharun@123";
        register.confirmPassword = "Tharun@123";
        neotericTechnologies.register = register;
        SubmitDetails submitDetails=new SubmitDetails();
        neotericTechnologies=submitDetails.submit(neotericTechnologies);
        LoginDetails loginDetails=new LoginDetails();
        neotericTechnologies=loginDetails.getLogin(neotericTechnologies,"tharunbabu565@gmail.com","Tharun@123");

        SelectCourse selectCourse=new SelectCourse();
        neotericTechnologies= selectCourse.selectCourse(neotericTechnologies,"java");
        Assertions.assertNotNull(neotericTechnologies.course);

    }
    @Test
    public void makePayment()
    {
        NeotericTechnologies neotericTechnologies = new NeotericTechnologies();
        Register register = new Register();
        register.firstName = "Bashiruddin";
        register.lastName = "Shaik";
        register.email = "bashir@gmail.com";
        register.mobileNo = "9611578479";
        register.createPassword = "Bashir@123";
        register.confirmPassword = "Bashir@123";
        neotericTechnologies.register = register;

        SubmitDetails submitDetails=new SubmitDetails();
        neotericTechnologies=submitDetails.submit(neotericTechnologies);

        LoginDetails loginDetails=new LoginDetails();
        neotericTechnologies=loginDetails.getLogin(neotericTechnologies,"bashir@gmail.com","Bashir@123");

        ViewListOfCourses listOfCourse=new ViewListOfCourses();
        neotericTechnologies=listOfCourse.listOfCourses(neotericTechnologies);

        SelectCourse selectCourse=new SelectCourse();
        neotericTechnologies= selectCourse.selectCourse(neotericTechnologies,"java full stack");

        MakePayment makePayment=new MakePayment();
        double payment=neotericTechnologies.course.fee;
        CourseJoinDetails courseJoinDetails=makePayment.makePayment(neotericTechnologies,payment);
        System.out.println(courseJoinDetails);
        Assertions.assertNotNull(courseJoinDetails);


    }

}