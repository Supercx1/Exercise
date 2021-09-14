package com.hspedu.homework04;

public class Works extends Staff{
    public Works(String name, double daysalary, int day) {
        super(name, daysalary, day);
    }

    @Override
    public double showSalary() {
        return super.showSalary()*1;
    }
}
