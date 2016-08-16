package com.example.aportillo.daggerexample.Model;

import javax.inject.Inject;

/**
 * Created by aportillo on 16/08/2016.
 */
public class Vehicle {
    private Motor motor;

    @Inject
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
