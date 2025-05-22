package com.example.uriyasofshana;

import java.util.Random;

public class Questions {
    private int n1;
    private int n2;
    Random random = new Random();
    public Questions (){
        this.n1 = random.nextInt(100) + 1;
        this.n2 = random.nextInt(100) + 1;
    }

    public int GetN1() {
        return n1;
    }

    public int GetN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
