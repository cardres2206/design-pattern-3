package com.example.patterns_banking.models.decorator;

import com.example.patterns_banking.models.Account;

public class AccountWithDrawDecorator extends AccountDecorator{
    public AccountWithDrawDecorator(Account account) {
        super(account);
    }
    @Override
    public void withdraw(double amount) {
        if(amount<=super.getBalance()+20000.0){
            super.withdraw(amount);
            System.out.println("su retiro de "+amount+" fue exitoso, su nuevo saldo es: "+super.getBalance());
        }
        else{
            System.out.println("su retiro de "+amount+" no fue exitoso, usted pudo retirar un" +
                    " valor maximo de " + (super.getBalance()+20000.0)+" su exedente fue de" +
                    ": "+(amount-super.getBalance()+20000.0));
            super.withdraw(amount);
            System.out.println("su nuevo saldo es: "+super.getBalance());
        }

    }
}
