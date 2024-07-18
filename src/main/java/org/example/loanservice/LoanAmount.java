package org.example.loanservice;

import org.example.loan.BankForm;
import org.example.loan.Customer;

public class LoanAmount {

    public double loanAmount(BankForm bankForm)
    {
        double monthlySavings=bankForm.customerDetails.salary-bankForm.customerDetails.monthlyExpensive;

      // double eligiblityOfLoan= (monthlySavings*60)/100;
       return monthlySavings*10;


    }
}
