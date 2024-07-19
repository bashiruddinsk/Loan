package org.example.loan.service;

import org.example.loan.model.Bank;
import org.example.loan.model.BankForm;
import org.example.loan.model.Customer;
import org.example.model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanTest {
   @Test
    public void applicationNumIsNotNull(){
       BankForm bankForm=new BankForm();
       Address customerAddress=new Address();
       customerAddress.area="kphb";
       customerAddress.street="4th cross";
       customerAddress.city="hyderabad";
       customerAddress.flatNo="101";
       customerAddress.pincode="521182";
       Address bankAddress=new Address();
       bankAddress.area="kphb";
       bankAddress.street="4th cross";
       bankAddress.city="hyderabad";
       bankAddress.flatNo="101";
       bankAddress.pincode="521182";

       Customer customer=new Customer("Bashir",9611578479L,customerAddress,50000,"Neoteric","Developer",20000,24);
       Bank bank=new Bank("ICICI",bankAddress,"1","Bashiruddin","icici001");
       bankForm.customerDetails=customer;
       bankForm.bankDetails=bank;
       BankService bankService=new BankService();
       bankForm=bankService.applyForm(bankForm);
       Assertions.assertNotNull(bankForm.appplicationNo);
    }
    @Test
   public void loanAMountIsGenerated(){
      BankForm bankForm=new BankForm();
      Address customerAddress=new Address();
      customerAddress.area="kphb";
      customerAddress.street="4th cross";
      customerAddress.city="hyderabad";
      customerAddress.flatNo="101";
      customerAddress.pincode="521182";
      Address bankAddress=new Address();
      bankAddress.area="kphb";
      bankAddress.street="4th cross";
      bankAddress.city="hyderabad";
      bankAddress.flatNo="101";
      bankAddress.pincode="521182";

      Customer customer=new Customer("Bashir",9611578479L,customerAddress,50000,"Neoteric","Developer",20000,7);
      Bank bank=new Bank("ICICI",bankAddress,"1","Bashiruddin","icici001");
      bankForm.customerDetails=customer;
      bankForm.bankDetails=bank;
      LoanAmount loanAmount=new LoanAmount();
      bankForm =loanAmount.loanAmount(bankForm);
      Assertions.assertTrue(bankForm.bankDetails.loanAmount>0.0);

   }
   @Test
   public void eligibleForLoan(){
      BankForm bankForm=new BankForm();
      Address customerAddress=new Address();
      customerAddress.area="kphb";
      customerAddress.street="4th cross";
      customerAddress.city="hyderabad";
      customerAddress.flatNo="101";
      customerAddress.pincode="521182";
      Address bankAddress=new Address();
      bankAddress.area="kphb";
      bankAddress.street="4th cross";
      bankAddress.city="hyderabad";
      bankAddress.flatNo="101";
      bankAddress.pincode="521182";

      Customer customer=new Customer("Bashir",9611578479L,customerAddress,50000,"Neoteric","Developer",20000,24);
      Bank bank=new Bank("ICICI",bankAddress,"1","Bashiruddin","icici001");
      bankForm.customerDetails=customer;
      bankForm.bankDetails=bank;
      LoanAmount loanAmount=new LoanAmount();
      bankForm=loanAmount.loanAmount(bankForm);
      ApplyLoan applyLoan=new ApplyLoan();
      bankForm=applyLoan.eligibility(bankForm,bankForm.bankDetails.loanAmount);
      Assertions.assertTrue(bankForm.customerDetails.monthlyEmi>0.0);

   }
}
