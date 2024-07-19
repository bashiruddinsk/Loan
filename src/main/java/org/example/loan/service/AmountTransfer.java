package org.example.loan.service;

import org.example.loan.model.BankForm;

import java.util.UUID;

public class AmountTransfer {

    public BankForm loanAmount(BankForm bankForm)
    {
        if (bankForm.bankDetails.isLoanApproved)
        {
            bankForm.customerDetails.loanAmount=bankForm.bankDetails.loanAmount;
            bankForm.loanNum=UUID.randomUUID().toString();
            System.out.println("loan amount is transferred to customer account");
            return bankForm;
        }

            System.out.println("loan amount is transferred to customer account");
            return bankForm;
    }
}
