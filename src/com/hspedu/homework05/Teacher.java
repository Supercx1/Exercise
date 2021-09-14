package com.hspedu.homework05;

public class Teacher extends Employee{
    private int classNum;
    private double classSal;
    public Teacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public String showSal() {
        return "姓名："+getName()+"年龄: "+ getAge()+"工资："+getSalary()*12+classSal*classNum;
    }
}
