package com.hspedu.homework05;

public class Scientist extends Employee{
    private double bonus;
    public Scientist(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String showSal() {
        return "姓名："+getName()+"年龄: "+ getAge()+"工资："+getSalary()*12+bonus;
    }
}
