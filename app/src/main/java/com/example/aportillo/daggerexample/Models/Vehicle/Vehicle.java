package com.example.aportillo.daggerexample.Models.Vehicle;

import com.example.aportillo.daggerexample.Models.Motor.Motor;

/**
 * Created by aportillo on 16/08/2016.
 */
public class Vehicle {
    private Motor motor;


    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
