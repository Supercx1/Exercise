package com.hspedu.homework03;

public class AsProfessor extends Teacher{
    public AsProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary()*1.2;
    }
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我是副教授");
    }
}
