package com.hspedu.polyparameter;

public class Employee {
    private String name;
    private double annual;

    public Employee(String name, double annual) {
        this.name = name;
        this.annual = annual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnual() {
        return annual*12;
    }

    public void setAnnual(double annual) {
        this.annual = annual;
    }
}
