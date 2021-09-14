package com.hspedu.student;

public class Extend_ {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="mary";
        pupil.age=13;
        pupil.sex='女';
        pupil.setScore(98);
        System.out.println("name="+ pupil.name +"age="+pupil.age+"sex="+pupil.sex);
        pupil.testing();
        System.out.println("=========================");
        Graduate graduate = new Graduate();
        graduate.name="mary";
        graduate.age=13;
        graduate.sex='女';
        graduate.setScore(98);
        graduate.testing();
        System.out.println("name="+ graduate.name +"age="+graduate.age+"sex="+graduate.sex);
    }





}
