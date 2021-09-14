package com.hspedu.extend_;
public class Pc extends Computer{
    private String brand;

    public Pc(String cpu, int memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.setBrand(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printinfo(){
        System.out.println(getDtails()+"\tbrand=\t"+brand);
    }
}
