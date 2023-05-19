package com.example.jse.m06.s02.esempio;

public class Dog {
    private int frequency;

    public Dog(int frequency) {
        this.frequency = frequency;
    }

    public void bark() {
        System.out.println("Sono un cane " + frequency);

    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Dog [frequency=" + frequency + "]";
    }

}
