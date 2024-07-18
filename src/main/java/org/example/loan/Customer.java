package org.example.loan;

import org.example.model.Address;

public class Customer {
    public String name;
    public long number;
    public Address address;
    public double salary;
    public String companyName;
    public String designation;
    public double monthlyExpensive;
    public double loanAmount;
    public int months;
    public double monthlyEmi;


    public Customer(String name, long number, Address address, double salary, String companyName, String designation, double monthlyExpensive,double loanAmount,int months) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.salary = salary;
        this.companyName = companyName;
        this.designation = designation;
        this.monthlyExpensive = monthlyExpensive;
        this.loanAmount=loanAmount;
        this.months=months;
    }
}
