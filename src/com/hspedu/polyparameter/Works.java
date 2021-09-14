package com.hspedu.polyparameter;

public class Works extends Employee {
    public Works(String name, double annual) {
        super(name, annual);
    }
    public String work(){
        return "员工" + getName()+"正在工作";
    }
}
