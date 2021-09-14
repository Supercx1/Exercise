package com.house.static_;

public class StaticExer {
    public static void main(String[] args) {
        StudentMoney student1 = new StudentMoney("mary");
        student1.allMoney(100);
        StudentMoney student2 = new StudentMoney("tom");
        student1.allMoney(200);
        StudentMoney.show();

    }

}
class StudentMoney{
    private String name;
    private static double monney;

    public StudentMoney(String name) {
        this.name = name;
    }

    public static void allMoney(double money){
        StudentMoney.monney += money;
    }
    public static void show(){
        System.out.println(StudentMoney.monney);
    }
}
