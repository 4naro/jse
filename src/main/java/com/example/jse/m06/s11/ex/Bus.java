/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

//import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle {
//    private static final Logger log = Logger.getGlobal();
    private boolean hasConditioning;
    /**
     * No-arg constructor
     */
    public Bus(String make, String model, boolean hasConditioning) {
//        log.info("Bus created");
        super(6, make, model);
        this.hasConditioning = hasConditioning;        
    }
    
    public void start() {
        System.out.println("Starting the " + make + " " + model + "bus...");
    }
    
    public void stop() {
        System.out.println("Stopping the " + make + " " + model + "bus...");
    }
    
    public void toggleConditioning() {
        hasConditioning = !hasConditioning;
        if (hasConditioning) {
            System.out.println("Turning on the air conditioning.");
        } else {
            System.out.println("Turning off the air conditioning.");
        }
    }
}
