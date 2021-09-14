package com.hspedu.homework08;

public class HomeWork08 {
    public static void main(String[] args) {
//        CheckAccount checkAccount = new CheckAccount(1000);
//        checkAccount.deposit(10);//1009
//        System.out.println(checkAccount.getBalance());
//        checkAccount.withdraw(10);//998
//        System.out.println(checkAccount.getBalance());
        SaveAcount saveAcount = new SaveAcount(1000);
        saveAcount.deposit(100);
        saveAcount.deposit(100);
        saveAcount.deposit(100);
        System.out.println(saveAcount.getBalance());
        saveAcount.deposit(100);
        System.out.println(saveAcount.getBalance());
        saveAcount.earnMonthlyInterest();
        System.out.println(saveAcount.getBalance());
        saveAcount.withdraw(100);
        System.out.println(saveAcount.getBalance());
        saveAcount.withdraw(100);
        saveAcount.withdraw(100);
        System.out.println(saveAcount.getBalance());
        saveAcount.withdraw(100);
        System.out.println(saveAcount.getBalance());






    }
}
