package org.example.service;

import org.example.bank.Account;
import org.example.bank.BankForm;
import org.example.model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}


