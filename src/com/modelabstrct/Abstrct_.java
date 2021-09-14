package com.modelabstrct;

abstract public class Abstrct_ {
    public static void main(String[] args) {
        Aa aa = new Aa();
        aa.time();
        Bb bb = new Bb();
        bb.time();

    }
    public abstract void job();
    public void time(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间" +(end -start));

    }
}
