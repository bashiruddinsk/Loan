package org.example.loan.service;

import org.example.loan.model.BankForm;

public class LoanAmount {

    public BankForm loanAmount(BankForm bankForm)
    {
        double monthlySavings=bankForm.customerDetails.salary-bankForm.customerDetails.monthlyExpensive;
        if (monthlySavings>bankForm.customerDetails.salary*0.4) {
            double loanAmount = monthlySavings * 10;
            bankForm.bankDetails.isLoanApproved=true;
            bankForm.bankDetails.loanAmount = loanAmount;
        }
        return bankForm;

    }
}
