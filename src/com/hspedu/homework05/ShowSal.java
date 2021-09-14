package com.hspedu.homework05;

public class ShowSal {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("marry",34,1000);
        System.out.println(peasant.showSal());
        Scientist scientist = new Scientist("tom",35,4000);
        scientist.setBonus(20000);
        System.out.println(scientist.showSal());
        Teacher teacher = new Teacher("simith",24,2000);
        teacher.setClassNum(10);
        teacher.setClassSal(100);
        System.out.println(teacher.showSal());
        Waiter waiter = new Waiter("jack",26,220);
        System.out.println(waiter.showSal());
        Worker worker = new Worker("yolly",22,1000);
        System.out.println(worker.showSal());



    }
}
