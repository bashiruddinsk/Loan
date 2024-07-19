package org.example.loan.service;

import org.example.loan.model.BankForm;

public class ApplyLoan {

       public BankForm eligibility(BankForm bankForm,double eligibilityAmount) {
           double monthlySavings = bankForm.customerDetails.salary - bankForm.customerDetails.monthlyExpensive;
           double sixtyPercentageOfMonthlySavings = monthlySavings * 0.6;
          double monthlyEmi= eligibilityAmount/bankForm.customerDetails.months;
          if(monthlyEmi<=sixtyPercentageOfMonthlySavings)
          {
              bankForm.customerDetails.monthlyEmi=monthlyEmi;
              System.out.println( "you are successfully eligible for the loan");
              return bankForm;
          }
           System.out.println( "you are not eligible for the loan");
          return bankForm;
       }

}
