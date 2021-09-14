package com.modelabstrct;

public class Bb extends Abstrct_{
    int num = 0;
    public void job(){
        for (int i = 0; i < 10000; i++) {
            num *=i;
        }
    }
}
