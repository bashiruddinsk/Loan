package org.example.loanservice;

import org.example.loan.Bank;
import org.example.loan.BankForm;
import org.example.loan.Customer;

import java.util.UUID;

public class BankService {


    public BankForm applyForm(BankForm bankForm){
        String applicationNumber=UUID.randomUUID().toString();
         bankForm=new BankForm();

         bankForm.apNo=applicationNumber;

          return bankForm;
    }

}
