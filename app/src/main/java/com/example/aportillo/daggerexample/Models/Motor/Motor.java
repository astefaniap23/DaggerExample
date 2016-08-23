package com.example.aportillo.daggerexample.Models.Motor;

/**
 * Created by aportillo on 16/08/2016.
 */
public class Motor {
    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
