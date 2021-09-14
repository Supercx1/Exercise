package com.hspedu.homework04;

public class Staff {
    private String name;
    private double daysalary;
    private int day;

    public Staff(String name, double daysalary, int day) {
        this.name = name;
        this.daysalary = daysalary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public double showSalary(){
        return daysalary*day;
    }
}
