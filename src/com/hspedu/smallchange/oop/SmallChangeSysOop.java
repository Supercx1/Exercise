package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*该类是完成零钱通各个功能的类
* */
public class SmallChangeSysOop {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-------零钱通明细--------";
    double money = 0;
    double balance = 0;
    Date date = null;
    String note = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    public void mainMenu(){
        do {
            System.out.println("\n==========零钱通菜单=======");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退   出");
            System.out.println("请选择（1-4)");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("你输入有错误！");
            }
        } while (loop);
        System.out.println("-----退出了零钱通项目-----");
    }
    public void detail(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        if(money<=0){
            System.out.println("收益入账金额必须大于0");
            return;
        }
        balance += money;
        date = new Date();
        details +="\n收益入账\t" + money +"\t"+sdf.format(date)+"\t"+balance;

    }
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        if(money<=0||money>balance){
            System.out.println("你的消费金额应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details +="\n" +note +"\t-"+money+"\t"+ sdf.format(date)+"\t"+balance;
    }
    public void exit(){
        String choice = "";
        while (true){
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if("y".equals(choice) || "y".equals(choice)){
                loop = false;
                break;
            }
            if(choice.equals("n")){
                break;
            }
        }
    }
}
