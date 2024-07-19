package org.example.loan.service;

import org.example.loan.model.BankForm;

import java.util.UUID;

public class BankService {


    public BankForm applyForm(BankForm bankForm){
        String applicationNumber=UUID.randomUUID().toString();
         bankForm=new BankForm();

         bankForm.appplicationNo=applicationNumber;

          return bankForm;
    }

}
