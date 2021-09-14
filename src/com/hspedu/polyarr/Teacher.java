package com.hspedu.polyarr;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+" salary=" + salary;
    }
    public String teach(){
        return "老师 " + getName() + "正在教JAVA";
    }
}
