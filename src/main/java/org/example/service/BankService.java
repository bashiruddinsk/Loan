package org.example.service;

import org.example.bank.Account;
import org.example.bank.BankForm;

import java.util.UUID;


public class BankService {
    Account account=null;
    public Account createAccount(BankForm bankForm)
    {
        if (bankForm.age>18) {
            account = new Account();
            account.accHolderName = bankForm.accountHolderName;
            account.address = bankForm.userAddress;
            account.emailId = bankForm.emailId;
            account.mobileNumber = bankForm.mobileNumber;
            account.accountNumber= UUID.randomUUID().toString();
        }
        return account;
    }
    public double deposit(double amount)
    {
        if (account!=null) {
            if (amount > 0)
                account.balance += amount;

            return account.balance;
        }
        else
            return 0;
    }



}