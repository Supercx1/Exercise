package com.hspedu.writeequals;

public class Docter {
    private String name;
    private int age;
    private String job;
    private char sex;

    public Docter(String name, int age, String job, char sex) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Docter)){
            return false;
        }
        Docter docter =(Docter)obj;
        return this.name.equals(docter.name)&&this.age==docter.age&&this.job.equals(docter.job)
                &&this.sex==docter.sex;
    }
}
