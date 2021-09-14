package com.hspedu.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("maryweqeqw", 16, "java学生");
        person[1] = new Person("asdas", 17, "学生");
        person[2] = new Person("asfasfe", 18, "部长");
        for(int i = 0; i< person.length; i++){
            System.out.println(person[i]);
        }
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length -1- i; j++) {
                if (person[i].getName().length() < person[i + 1].getName().length()) {
                    Person temp = person[i];
                    person[i] = person[i + 1];
                    person[i+1] = temp;
                    System.out.println(person[i]);
                    System.out.println(person[i+1]);
                }
            }
        }
        for(int i = 0; i< person.length; i++){
            System.out.println(person[i]);
        }
    }

}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
