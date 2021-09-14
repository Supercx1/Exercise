package com.hspedu.extend_;

public class Student_main {
    public static void main(String[] args) {
        Person person = new Person("张三",18);
        System.out.println(person.say());
        Student student = new Student("李四",19,10,100);
        System.out.println(student.say());


    }
}
