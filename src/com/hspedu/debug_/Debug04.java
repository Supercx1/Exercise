package com.hspedu.debug_;

public class Debug04 {
    public static void main(String[] args) {
        Dog dog = new Dog("小花");
        System.out.println(dog);

    }
}
class Dog{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
