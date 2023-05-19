/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

//import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public abstract class Vehicle {
    protected int numWheels;
    protected String make;
    protected String model;
//    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Vehicle(int numWheels, String make, String model) {
//        log.info("Vehicle created");
        this.numWheels = numWheels;
        this.make = make;
        this.model = model;
    }
    
    public abstract void start();
    
    public abstract void stop();
}
