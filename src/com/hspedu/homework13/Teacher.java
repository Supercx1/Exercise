package com.hspedu.homework13;

public class Teacher extends Person{

    private int t_age;

    public Teacher(String name, char sex, int age, int t_age) {
        super(name, sex, age);
        this.t_age = t_age;
    }

    public int getT_age() {
        return t_age;
    }

    public void setT_age(int t_age) {
        this.t_age = t_age;
    }
    public void teach(){
        System.out.println(getName()+"我承诺，我要好好教JAVA");
    }

    @Override
    public String play() {
        return "老师："+ getName()+"爱下象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(super.info());
        System.out.println("工龄："+t_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_age=" + t_age +
                '}'+super.toString();
    }
}
