package com.example.jse.m11.s05;

public class UnsynchronizedHello {
    public void sayHello(String name) {
        System.out.print("Hello ");
        try {
            // !!! job simulation - don't do this in production code !!!
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            Thread.currentThread().interrupt();
        }
        System.out.println(name + "!");
    }
}
