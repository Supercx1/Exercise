package com.hspedu.homework04;

public class Print {
    public static void main(String[] args) {
        Works works = new Works("mary",1500,4);
        System.out.println(works.showSalary());
        Manager manager = new Manager("tom",4000,2);
        System.out.println(manager.showSalary());
    }
}
