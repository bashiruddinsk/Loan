package org.example.loan.model;

import org.example.model.Address;

public class Bank {


    public String bankName;
    public Address address;
    public String accNum;
    public String accHolderName;
    public String ifscCode;
    public double loanAmount;
    public  boolean isLoanApproved;


    public Bank(String bankName, Address address, String accNum, String accHolderName, String ifscCode) {
        this.bankName = bankName;
        this.address = address;
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.ifscCode = ifscCode;
    }
}
