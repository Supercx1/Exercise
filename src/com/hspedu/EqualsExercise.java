package com.hspedu;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("mary",18,'男');
        Person person2 = new Person("mary",18,'男');
        System.out.println(person1.equals(person2));


    }
}
class Person{
    private String name;
    private int age;
    private char sex;
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person) obj;
            return this.name.equals(p.name)&&this.age==p.age&&this.sex==p.sex;
        }
        return false;


    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


}
