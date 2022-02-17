package com.example.jse.m11.s04;

public class MainForRunnable {
    public static void main(String[] args) {
        System.out.println("In thread " + Thread.currentThread().getName());

        Runnable my = new MyRunnable();
        Thread t0 = new Thread(my);
        System.out.println("The new thread has not started yet");

        t0.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted%n", Thread.currentThread().getName());
        }

        System.out.printf("Thread named %s is done%n", Thread.currentThread().getName());
    }
}