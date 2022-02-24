package com.example.warimano.exercises.section.seven.polymorphism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford starting";
    }

    @Override
    public String accelerate() {
        return "Ford accelerating";
    }

    @Override
    public String brake() {
        return "Ford braking";
    }
}
