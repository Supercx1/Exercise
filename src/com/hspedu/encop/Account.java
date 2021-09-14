package com.hspedu.encop;

public class Account {
    private String name;
    private double salary;
    private String pwd;

    public Account() {
    }

    public Account(String name, double salary, String pwd) {
       this.setName(name);
       this.setSalary(salary);
       this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>2&&name.length()<4) {
            this.name = name;
        }else {
            System.out.println("姓名要求2-4个字符，否则默认无名");
            this.name = "无名";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>60) {
            this.salary = salary;
        }else{
            System.out.println("月薪必须大于60，否则默认为0");
            this.salary=0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length()>6) {
            this.pwd = pwd;
        }else{
            System.out.println("密码必须大于6位，否则默认为000000");
            this.pwd="000000";

        }
    }
    public void infoAccount(){
        System.out.println("name=" + name + "salary="+salary+"pwd="+pwd);
    }
}
