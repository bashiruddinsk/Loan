package org.example.loanservice;

import org.example.loan.Bank;
import org.example.loan.BankForm;
import org.example.loan.Customer;

public class ApplyLoan {

       public String loanAmount(BankForm bankForm,double eligibilityAmount) {
           double monthlySavings = bankForm.customerDetails.salary - bankForm.customerDetails.monthlyExpensive;
           double sixtyPercentageOfMonthlySavings = monthlySavings % 60;
          double monthlyEmi= eligibilityAmount/bankForm.customerDetails.months;
          bankForm.customerDetails.monthlyEmi=monthlyEmi;
          if(monthlyEmi<=sixtyPercentageOfMonthlySavings)
          {
              return "you are successfully eligible for the loan";

          }
           return("you are not eligible for the loan");
       }

}
