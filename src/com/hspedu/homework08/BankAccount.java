package com.hspedu.homework08;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double account){
        balance += account;
    }
    public void withdraw(double account){
        balance -= account;
    }
}
