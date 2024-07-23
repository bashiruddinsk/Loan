package org.example.neoteric.service;

import org.example.neoteric.model.Login;
import org.example.neoteric.model.NeotericTechnologies;
import org.example.neoteric.model.User;

public class SubmitDetails {

    public NeotericTechnologies submit(NeotericTechnologies nt){




        if (nt.register.isSignup)
        {
            System.out.println("Already registered");
            return nt;
        }

        if (!nt.register.createPassword.equals(nt.register.confirmPassword)) {

            System.out.println("Password is not matching");

        } else if (!nt.register.email.contains("@")) {

            System.out.println("email is invalid");
        } else if (nt.register.mobileNo.length() != 10) {

            System.out.println("mobileNo is invalid");
        } else {


            nt.register.isSignup = true;

            User user=new User();
            user.firstName=nt.register.firstName;
            user.lastName=nt.register.lastName;
            user.mobileNo=nt.register.mobileNo;
            user.email=nt.register.email;
            nt.user=user;
            Login login=new Login();
            login.email=nt.register.email;
            login.password=nt.register.createPassword;
            nt.login=login;
            System.out.println("Successfully signup");

        }



        return nt;
    }

}