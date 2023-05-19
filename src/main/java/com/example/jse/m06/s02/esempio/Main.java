package com.example.jse.m06.s02.esempio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(100), new Pitbull(90), new Husky(80), new Labrador(70) };
        System.out.println(Arrays.toString(dogs));
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();

        }
        f(dogs[dogs.length - 1]);
    }

    public static void f(Dog dog) {
        if (dog.getFrequency() <= 90) {
            System.out.println("non abbaia");
        }
//        if (dog.getFrequency() > 90)
        else {
            dog.bark();
        }

    }
}
