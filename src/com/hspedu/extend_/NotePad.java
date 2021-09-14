package com.hspedu.extend_;

public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, String disk, String color) {
        super(cpu, memory, disk);
        this.setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void printinfo(){
        System.out.println(getDtails()+"\tclor=\t"+color);
    }
}
