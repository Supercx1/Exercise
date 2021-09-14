package com.hspedu.homework08;

public class SaveAcount extends  BankAccount{
    private int count=3;
    private double rate=0.01;

    public SaveAcount(double balance) {
        super(balance);
    }
    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance()*rate);
    }
    @Override
    public void deposit(double account) {
        if(count>0){
            super.deposit(account);
        }else {
            super.deposit(account-1);
        }
        count--;
    }

    @Override
    public void withdraw(double account) {
        if(count>0){
            super.withdraw(account);
        }else {
            super.withdraw(account+1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
