package com.hspedu.extend_;

public class Computer {
    private String cpu;
    private int memory;
    private String disk;

    public Computer(String cpu, int memory, String disk) {
        this.setCpu(cpu);
        this.setDisk(disk);
        this.setMemory(memory);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDtails() {
        return "cpu=\t" + cpu + "\tdisk\t" + disk + "\tmemory\t" + memory;
    }

}

