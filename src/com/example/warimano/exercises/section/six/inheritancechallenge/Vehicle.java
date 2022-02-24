package com.example.warimano.exercises.section.six.inheritancechallenge;

public class Vehicle {
    private int speed = 0;
    private final int weight;

    public Vehicle(int weight) {
        this.weight = Math.max(weight, 1);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }
}
