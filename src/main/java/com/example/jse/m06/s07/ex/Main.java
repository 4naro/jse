/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Complete the classes Cat, Dog, Mouse with a toString() override
 * 
 * Put instances of those classes in an array, and print them as strings
 */
class Cat2 {
    private String name;

    public Cat2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}

class Dog2 {
    private String name;

    public Dog2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}

class Mouse2 {
    private String name;

    public Mouse2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mouse: " + name;
    }
}

public class Main {
    public static void main(String[] args ) {
        Object tom = new Cat2("Tom");
        System.out.println(tom.toString());
        System.out.println("***")   ;
        
//        Object[] objects = new Object[3];
//        objects[0] = new Cat2("Kitty");
//        objects[1] = new Dog2("Buddy");
//        objects[2] = new Mouse2("Jerry");
        Object [] objects = {new Cat2("Kitty"),new Dog2("Buddy"),new Mouse2("Jerry")};
        
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
