/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

//import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle {
//    private static final Logger log = Logger.getGlobal();
      private boolean hasConditioning;
    /**
     * No-arg constructor
     */
    public Car(String make, String model, boolean hasConditioning) {
//        log.info("Car created");
        super(4,make, model);
        this.hasConditioning = hasConditioning;
    }
    
    public void start() {
        System.out.println("Starting the " + make + " " + model + " car...");
    }
    
    public void stop() {
        System.out.println("Starting the " + make + " " + model + " car...");
    }
    
    public void toggleConditioning() {
        hasConditioning = !hasConditioning;
        if (hasConditioning) {
            System.out.println("Turning on the air conditioning.");
        } else {
            System.out.println("Turno off the air conditioing.");
        }
    }
}
    
    
