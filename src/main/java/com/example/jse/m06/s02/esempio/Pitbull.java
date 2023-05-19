package com.example.jse.m06.s02.esempio;

public class Pitbull extends Dog {
    public Pitbull(int frequency) {
        super(frequency);
    }

    @Override
    public void bark() {
        System.out.println("Sono un Pitbull " + getFrequency());
    }
}
