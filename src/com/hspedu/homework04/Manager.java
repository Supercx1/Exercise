package com.hspedu.homework04;

public class Manager extends Staff{
    public Manager(String name, double daysalary, int day) {
        super(name, daysalary, day);
    }

    @Override
    public double showSalary() {
        return super.showSalary()*1.2+1000;
    }
}
