package com.hspedu.student;

public class Student {
    public String name;
    public int age;
    public char sex;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testMath(){
        System.out.println("学生正在考数学");
    }

}
