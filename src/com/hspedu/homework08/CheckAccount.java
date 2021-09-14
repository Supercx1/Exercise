package com.hspedu.homework08;

public class CheckAccount extends BankAccount{
    public CheckAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double account) {
        super.deposit(account-1 );
    }

    @Override
    public void withdraw(double account) {
        super.withdraw(account+1);
    }
}
