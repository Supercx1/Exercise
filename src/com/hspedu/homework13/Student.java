package com.hspedu.homework13;

public class Student extends Person{

    private int id;

    public Student(String name, char sex, int age, int id) {
        super(name, sex, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void study(){
        System.out.println(getName()+"我承诺，我要好好学习");
    }

    @Override
    public String play() {
        return "学生："+ getName()+"爱踢足球";
    }
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(super.info());
        System.out.println("学号："+ id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}'+super.toString();
    }
}
