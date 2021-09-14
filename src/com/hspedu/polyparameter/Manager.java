package com.hspedu.polyparameter;

public class Manager extends Employee{
    private double bonous;

    public Manager(String name, double annual, double bonous) {
        super(name, annual);
        this.bonous = bonous;
    }

    public double getBonous() {
        return bonous;
    }

    public void setBonous(double bonous) {
        this.bonous = bonous;
    }
    public String manage(){
        return "经理 "+ getName() + "管理工作";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonous;
    }
}
